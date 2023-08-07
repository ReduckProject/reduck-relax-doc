package net.reduck.relexdoc.util;

import com.thoughtworks.qdox.model.*;
import net.reduck.relexdoc.entity.RelaxApiParameter;
import net.reduck.relexdoc.utils.JavaTypeHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Gin
 * @since 2023/7/20 16:03
 */
public class SpringMvcApiParser {
    private static String nestedParameterPrefix = "└─ ";
    private static String depthPrefix = "        ";

    public static String url(JavaAnnotatedElement element) {
        return SpringAnnotationHelper.getUrl(element);
    }

    public static String comment(JavaAnnotatedElement element) {
        return element.getComment();
    }

    public static String requestMethod(JavaMethod javaMethod) {
        JavaAnnotation annotation = SpringAnnotationHelper.getRequestMappingAnnotation(javaMethod);
        if (annotation == null) {
            return "";
        }

        String name = annotation.getType().getSimpleName();
        name = name.contains(".") ? name.substring(name.lastIndexOf(".") + 1) : name;

        switch (name) {
            case "GetMapping":
                return "GET";
            case "RequestMapping":
                return annotation.getProperty("method") == null
                        ? "GET, HEAD, POST, PUT, PATCH, DELETE, OPTIONS, TRACE"
                        : annotation.getProperty("method").toString()
                        .replaceAll("\\{|}|RequestMethod", "");

            case "PostMapping":
                return "POST";
            case "PutMapping":
                return "PUT";
            case "PatchMapping":
                return "PATCH";
            case "DeleteMapping":
                return "DELETE";

            default:
                return "";
        }
    }

    public static List<RelaxApiParameter> requestParameter(JavaMethod javaMethod) {
        List<RelaxApiParameter> requestParams = new ArrayList<>();
        List<JavaParameter> parameterList = javaMethod.getParameters();
        for (JavaParameter parameter : parameterList) {
            parameterParser(parameter, requestParams);
        }

        return requestParams;
    }

    public static List<RelaxApiParameter> responseParameter(JavaMethod javaMethod) {
        List<RelaxApiParameter> responseParams = new ArrayList<>();
        JavaClass returnClass = javaMethod.getReturns();
        parameterParser(returnClass, false, 0, responseParams);
        return responseParams;
    }

    static void parameterParser(JavaParameter parameterClass, List<RelaxApiParameter> parameters) {
        boolean validated = Jsr380Utils.annotationWithValid(parameterClass);
        if (JavaTypeHelper.isPrimitive(parameterClass.getCanonicalName())) {
            parameters.add(buildParameter(parameterClass, validated, 0));
        }

        parameterParser(parameterClass.getJavaClass(), validated, 0, parameters);
    }

    static void parameterParser(JavaParameter parameterClass, boolean validated, List<RelaxApiParameter> parameters) {
        if (JavaTypeHelper.isPrimitive(parameterClass.getCanonicalName())) {
            parameters.add(buildParameter(parameterClass, validated, 0));
        }

        if (JavaTypeHelper.isCollection(parameterClass.getCanonicalName())) {
            System.out.println();
        }

        parameterParser(parameterClass.getJavaClass(), validated, 0, parameters);
    }

    static void parameterParser(JavaClass parameterClass, boolean validated, int deep, List<RelaxApiParameter> parameters) {
        if (JavaTypeHelper.isCollection(parameterClass.getCanonicalName())) {
            if (parameterClass instanceof JavaParameterizedType) {
                JavaType javaType = ((JavaParameterizedType) parameterClass).getActualTypeArguments().get(0);

                if (javaType instanceof JavaClass) {
                    parameterParser((JavaClass) javaType, validated, deep + 1, parameters);
                }
//                parameterParser(parameterizedType.getActualTypeArguments().get(0), validated, deep + 1, parameters);
            }
            return;
        }

        if (!JavaTypeHelper.isPrimitive(parameterClass.getCanonicalName())) {
            List<JavaField> fields = parameterClass.getFields();
            for (JavaField field : fields) {
                JavaClass filedClass = field.getType();
                RelaxApiParameter relaxApiParameter = buildParameter(field, validated, deep);
                parameters.add(relaxApiParameter);
                if (!JavaTypeHelper.isPrimitive(filedClass.getName()) && !JavaTypeHelper.isCollection(filedClass.getName())) {
                    parameterParser(filedClass, validated, deep + 1, parameters);
                }
            }
        }
    }

    static RelaxApiParameter buildParameter(JavaParameter javaParameter, boolean validated, int deep) {
        RelaxApiParameter requestParam = new RelaxApiParameter();
        requestParam.setName(formatName(javaParameter.getName(), deep))
                .setType(javaParameter.getValue())
                .setDesc(javaParameter.getComment())
                .setRequireDesc("是")
                .setConstraintDesc("-")
                .setExample("-");
        if (validated) {
            ValidatorProcessor.process(javaParameter, requestParam);
        }
        return requestParam;
    }

    static RelaxApiParameter buildParameter(JavaField field, boolean validated, int deep) {
        RelaxApiParameter requestParam = new RelaxApiParameter();
        requestParam.setName(formatName(field.getName(), deep))
                .setType(getSimpleName(field.getType().getSimpleName()))
                .setDesc(field.getComment())
                .setRequireDesc("是")
                .setConstraintDesc("-")
                .setExample("-");
        if (validated) {
            ValidatorProcessor.process(field, requestParam);
        }
        System.out.println(field.getType().getSimpleName() + "|" + field.getType().getCanonicalName());

        return requestParam;
    }

    static String formatName(String name, int deep) {
        if (deep < 1) {
            return name;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < deep; i++) {
            sb.append(depthPrefix);
        }
        return sb.toString();
    }

    static String getSimpleName(String name) {
        return name.contains(".") ? name.substring(name.lastIndexOf(".") + 1) : name;
    }

}

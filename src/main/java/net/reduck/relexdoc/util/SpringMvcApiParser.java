package net.reduck.relexdoc.util;

import com.thoughtworks.qdox.model.*;
import net.reduck.relexdoc.entity.RelaxApiParameter;
import net.reduck.relexdoc.utils.JavaTypeHelper;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Gin
 * @since 2023/7/20 16:03
 */
public class SpringMvcApiParser {
    private static String nestedParameterPrefix = "└─ ";

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
                        .replace("{", "")
                        .replace("}", "")
                        .replace("RequestMethod.", "");

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
//            if (!JavaTypeHelper.isPrimitive(parameter.getName()) && !JavaTypeHelper.isCollection(parameter.getName())) {
//                List<JavaField> fields = parameter.getJavaClass().getFields();
//                for (JavaField field : fields) {
//                    RelaxApiParameter requestParam = new RelaxApiParameter();
//                    requestParam.setName(field.getName())
//                            .setType(field.getType().getName())
//                            .setDesc(field.getComment())
//                            .setRequireDesc("是")
//                            .setConstraintDesc("-")
//                            .setExample("-");
//                    requestParams.add(requestParam);
//                }
//            }
            parameterParser(parameter, requestParams);
        }

        return requestParams;
    }

    public static List<RelaxApiParameter> responseParameter(JavaMethod javaMethod) {
        List<RelaxApiParameter> responseParams = new ArrayList<>();
        JavaClass returnClass = javaMethod.getReturns();
//        if (!JavaTypeHelper.isPrimitive(returnClass.getName()) && !JavaTypeHelper.isCollection(returnClass.getName())) {
//            List<JavaField> fields = returnClass.getFields();
//            for (JavaField field : fields) {
//                RelaxApiParameter requestParam = new RelaxApiParameter();
//                requestParam.setName(field.getName())
//                        .setType(field.getType().getName())
//                        .setDesc(field.getComment())
//                        .setRequireDesc("是")
//                        .setConstraintDesc("-")
//                        .setExample("-");
//                responseParams.add(requestParam);
//            }
//        }
        parameterParser(returnClass, false, 0, responseParams);
        return responseParams;
    }

    static void parameterParser(JavaClass parameterClass, boolean validated, List<RelaxApiParameter> parameters) {
        parameterParser(parameterClass, validated, 0, parameters);
    }

    static void parameterParser(JavaParameter parameterClass, List<RelaxApiParameter> parameters) {
        if(JavaTypeHelper.isPrimitive(parameterClass.getName())) {
            parameters.add(buildParameter(parameterClass));
        }

        if(JavaTypeHelper.isCollection(parameterClass.getName())){

        }

        parameterParser(parameterClass.getJavaClass(), false, 0, parameters);
    }

        static void parameterParser(JavaClass parameterClass, boolean validated, int deep, List<RelaxApiParameter> parameters) {
        if (!JavaTypeHelper.isPrimitive(parameterClass.getName()) && !JavaTypeHelper.isCollection(parameterClass.getName())) {
            List<JavaField> fields = parameterClass.getFields();
            for (JavaField field : fields) {
                RelaxApiParameter requestParam = new RelaxApiParameter();
                requestParam.setName(formatName(field.getName(), deep))
                        .setType(field.getType().getName())
                        .setDesc(field.getComment())
                        .setRequireDesc(ValidatedUtils.required(field) ? "是" : "否")
                        .setConstraintDesc("-")
                        .setExample("-");
                System.out.println(field.getAnnotations());
                JavaClass filedClass = field.getType();
                parameters.add(requestParam);
                if (!JavaTypeHelper.isPrimitive(filedClass.getName()) && !JavaTypeHelper.isCollection(filedClass.getName())) {
                    parameterParser(filedClass, validated, deep  + 1, parameters);
                }
            }
        }
    }

    static RelaxApiParameter buildParameter(JavaParameter javaParameter) {
        RelaxApiParameter requestParam = new RelaxApiParameter();
        requestParam.setName(javaParameter.getName())
                .setType(javaParameter.getValue())
                .setDesc(javaParameter.getComment())
                .setRequireDesc("是")
                .setConstraintDesc("-")
                .setExample("-");
        return requestParam;
    }

    static String formatName(String name, int deep) {
        if(deep < 1){
            return name;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < deep; i++) {
            sb.append("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
        }
        sb.append(nestedParameterPrefix).append(name);
        System.out.println(deep + "=" + sb);
        return sb.toString();
    }

}

package net.reduck.relexdoc.util;

import com.thoughtworks.qdox.JavaProjectBuilder;
import com.thoughtworks.qdox.model.JavaClass;
import com.thoughtworks.qdox.model.JavaMethod;
import com.thoughtworks.qdox.model.JavaParameter;

import java.io.File;

/**
 * @author Gin
 * @since 2023/7/19 16:35
 */
public class Main3 {

    public static void main(String[] args) {
        JavaProjectBuilder builder = new JavaProjectBuilder();

        ProjectBuilderLoader.load(builder, new File("/Users/zhanjinkai/Documents/Gitee/x-www-form-urlencoded/src/main/java/com/example/xwwwformurlencoded"));

        for(JavaClass javaClass : builder.getClasses()) {
            System.out.println(javaClass.getName());

            for(JavaMethod javaMethod : javaClass.getMethods()) {
                for(JavaParameter parameter : javaMethod.getParameters()) {
                    System.out.println(SpringAnnotationHelper.containsRequestBody(parameter));
                }
//                for(JavaAnnotation annotation : javaMethod.getAnnotations()) {
//                    System.out.println(annotation.getType().getName());
//                }
            }
        }
        builder.getClasses()
                .forEach(javaClass -> System.out.println(javaClass.getName() + ":" + javaClass.getCanonicalName()));
    }
}

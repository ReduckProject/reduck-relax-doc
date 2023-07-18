package net.reduck.relexdoc.util;

import com.thoughtworks.qdox.JavaProjectBuilder;
import com.thoughtworks.qdox.model.JavaClass;
import com.thoughtworks.qdox.model.JavaMethod;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Reduck
 * @since 2022/12/12 14:33
 */
public class StatisticUtils {

    public static List<String> getAllUrl(String... paths) throws IOException {
        JavaProjectBuilder builder = new JavaProjectBuilder();

        for(String dep : paths) {
            File file = new File(dep);
            ProjectBuilderLoader.load(builder, file);
        }

        List<String> urls = new ArrayList<>();
        for (JavaClass javaClass : builder.getClasses()) {

            if(!javaClass.getName().toLowerCase().contains("controller")) {
                continue;
            }
            if (!SpringMappingHelper.containController(javaClass)) {
                System.out.println("Skip :" + javaClass.getCanonicalName());
                continue;
            }

            System.out.println(javaClass.getCanonicalName());
            String prefix = SpringMappingHelper.getUrl(javaClass.getAnnotations());
            for (JavaMethod javaMethod : javaClass.getMethods()) {
                if (!SpringMappingHelper.containRequestMapping(javaMethod)) {
                    continue;
                }
                String suffix = SpringMappingHelper.getUrl(javaMethod.getAnnotations());
                urls.add(prefix + suffix);
            }
        }

        return urls;
    }

    public static void main(String[] args) throws IOException {
//        List<String> urls = getAllUrl("/Users/zhanjinkai/Documents/GitHub/reduck-project/reduck-jpa-test/src/main/java/net/reduck/jpa/test/controller/TypeController.java");
        List<String> urls = getAllUrl("/Users/zhanjinkai/.m2/repository/org/apache/activemq/activemq-all/5.11.0/activemq-all-5.11.0-sources.jar");

        urls.forEach(System.out::println);
        System.out.println(urls.size());
    }
}

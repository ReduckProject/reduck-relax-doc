package net.reduck.relexdoc.util;

import com.thoughtworks.qdox.JavaProjectBuilder;
import com.thoughtworks.qdox.model.JavaClass;

import java.io.File;

/**
 * @author Gin
 * @since 2023/7/18 15:35
 */
public class Main2 {

    public static void main(String[] args) {
        JavaProjectBuilder builder = new JavaProjectBuilder();
        builder.setEncoding("UTF-8");
        ProjectBuilderLoader.load(builder, new File("/Volumes/T7/macos_back/workspace/dsm/frontend/src/main/java/com/secsmart/dsm/frontend"));

        for(JavaClass javaClass : builder.getClasses()) {
            if(javaClass.getName().equals("DocumentController")) {
                System.out.println();


            }
        }
    }
}

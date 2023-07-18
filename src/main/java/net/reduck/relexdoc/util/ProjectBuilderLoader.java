package net.reduck.relexdoc.util;

import com.thoughtworks.qdox.JavaProjectBuilder;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

/**
 * @author Gin
 * @since 2023/7/18 16:23
 */
public class ProjectBuilderLoader {

    public static void load(JavaProjectBuilder builder, File file) {

        if (!file.exists()) {
            throw new RuntimeException("文件不存在");
        }

        if (file.isDirectory()) {
            File[] subs = file.listFiles();
            for (File sub : subs) {
                load(builder, sub);
            }

            return;
        }

        if (file.getName().endsWith(".jar")) {
            try {
                loadSourceJar(builder, file);
                return;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        try {
            if(javaSource(file.getName())) {
                builder.addSource(file);
            }
            else {
                System.out.println(file.getName());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void loadSourceJar(JavaProjectBuilder builder, File file) throws IOException {
        JarFile jarFile = new JarFile(file);
        String sourceURL = file.toURI().toURL().toString();
        builder.setEncoding("UTF-8");
        for (Enumeration<?> entries = jarFile.entries(); entries.hasMoreElements(); ) {
            JarEntry entry = (JarEntry) entries.nextElement();

            String name = entry.getName();
            try {
                if (javaSource(name)) {
                    String uri = "jar:" + sourceURL + "!/" + name;
                    builder.addSource(new URL(uri));
                }
            } catch (Throwable e) {
                e.printStackTrace();
            }
        }
    }

    static boolean javaSource(String name) {
        return name.endsWith(".java") && !name.endsWith("/package-info.java");
    }

    public static void main(String[] args) throws IOException {
        JavaProjectBuilder builder = new JavaProjectBuilder();
        builder.setEncoding("UTF-8");

        loadSourceJar(builder, new File("/Users/zhanjinkai/.m2/repository/org/springframework/spring-web/5.1.3.RELEASE/spring-web-5.1.3.RELEASE-sources.jar"));

        System.out.println(builder.getClasses().size());
    }
}

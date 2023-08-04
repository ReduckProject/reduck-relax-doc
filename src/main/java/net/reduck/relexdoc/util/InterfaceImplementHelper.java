package net.reduck.relexdoc.util;

import net.reduck.relexdoc.parse.Jsr380Processor;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Gin
 * @since 2023/8/4 17:17
 */
public class InterfaceImplementHelper {

    public static <T> List<Class<T>> findInterfaceImplement(Class<T> interfaceType) throws ClassNotFoundException {
        List<Class<T>> implementations = new ArrayList<>();
        String interfaceName = interfaceType.getName();
        String interfaceResource = interfaceName.replace('.', '/') + ".class";
        ClassLoader classLoader = InterfaceImplementHelper.class.getClassLoader();

        // 获取所有类文件资源
        URL[] urls = ((URLClassLoader) classLoader).getURLs();
        for (URL url : urls) {
            File dir = new File(url.getFile());
            if (dir.isDirectory()) {
                findImplementationsInDirectory(interfaceName, dir, implementations);
            }
        }
        return implementations;
    }


    public static <T> List<Class<T>> findImplementationsOfInterface(Class<T> interfaceClass) throws IOException, ClassNotFoundException {
        List<Class<T>> implementations = new ArrayList<>();
        String interfaceName = interfaceClass.getName();
        String interfaceResource = interfaceName.replace('.', '/') + ".class";
        ClassLoader classLoader = InterfaceImplementHelper.class.getClassLoader();

        // 获取所有类文件资源
        URL[] urls = ((URLClassLoader) classLoader).getURLs();
        for (URL url : urls) {
            File dir = new File(url.getFile());
            if (dir.isDirectory()) {
                findImplementationsInDirectory(interfaceName, dir, implementations);
            }
        }
        return implementations;
    }

    private static <T> void findImplementationsInDirectory(String interfaceName, File directory, List<Class<T>> implementations) throws ClassNotFoundException {
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    findImplementationsInDirectory(interfaceName, file, implementations);
                } else if (file.getName().endsWith(".class")) {
                    String className = file.getPath();
                    className = className.substring(className.indexOf("classes") + 8, className.lastIndexOf(".class"));
                    className = className.replace(File.separatorChar, '.');

                    // 加载类并检查是否实现了接口
                    Class<?> clazz = Class.forName(className);
                    if (clazz.getInterfaces() != null) {
                        for (Class<?> iface : clazz.getInterfaces()) {
                            if (iface.getName().equals(interfaceName)) {
                                implementations.add((Class<T>) clazz);
                                break;
                            }
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Class<Jsr380Processor>> implementations = findImplementationsOfInterface(Jsr380Processor.class);
        for (Class<?> clazz : implementations) {
            System.out.println("Class name: " + clazz.getName());
        }
    }
}

package net.reduck.relexdoc.util;

import com.thoughtworks.qdox.model.JavaAnnotation;
import com.thoughtworks.qdox.model.JavaField;
import com.thoughtworks.qdox.model.JavaParameter;
import net.reduck.relexdoc.engine.Instances;
import net.reduck.relexdoc.entity.RelaxApiParameter;
import net.reduck.relexdoc.parse.Jsr380Translator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Gin
 * @since 2023/8/4 17:51
 */
public class ValidatorProcessor {
    private static final List<Jsr380Translator> processors = new ArrayList<>();

    static {
        try {
            List<Class<Jsr380Translator>> implementations = InterfaceImplementHelper.findImplementationsOfInterface(Jsr380Translator.class);
            for (Class<Jsr380Translator> processorClass : implementations) {
                try {
                    processors.add(processorClass.newInstance());
                } catch (InstantiationException | IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void process(JavaField javaField, RelaxApiParameter parameter) {
        for (JavaAnnotation annotation : javaField.getAnnotations()) {
//            if (!SpringAnnotationHelper.containsAnnotation(annotation.getType().getAnnotations(), "Constraint")) {
//                continue;
//            }
            Instances.jsr380Engine.process(javaField.getType(), annotation, parameter);
        }

    }

    public static void process(JavaParameter javaParameter, RelaxApiParameter parameter) {
        for (JavaAnnotation annotation : javaParameter.getAnnotations()) {
//            if (!SpringAnnotationHelper.containsAnnotation(annotation.getType().getAnnotations(), "Constraint")) {
//                continue;
//            }

            Instances.jsr380Engine.process(javaParameter.getJavaClass(), annotation, parameter);
        }
    }
}

package net.reduck.relexdoc.util;

import com.thoughtworks.qdox.model.JavaAnnotation;
import com.thoughtworks.qdox.model.JavaClass;
import com.thoughtworks.qdox.model.JavaField;
import com.thoughtworks.qdox.model.JavaParameter;
import net.reduck.relexdoc.entity.RelaxApiParameter;
import net.reduck.relexdoc.parse.Jsr380Processor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Gin
 * @since 2023/8/4 17:51
 */
public class ValidatorProcessor {
    private static final List<Jsr380Processor> processors = new ArrayList<>();

    static {
        try {
            List<Class<Jsr380Processor>> implementations = InterfaceImplementHelper.findImplementationsOfInterface(Jsr380Processor.class);
            for(Class<Jsr380Processor> processorClass : implementations) {
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

    public static void process(JavaField javaField, RelaxApiParameter parameter){
        for(Jsr380Processor processor : processors){
            for(JavaAnnotation annotation : javaField.getAnnotations()) {
                if(processor.support(annotation)) {
                    processor.process(javaField.getType(), annotation, parameter);
                }
            }
        }
    }

    public static void process(JavaParameter javaParameter, RelaxApiParameter parameter){
        for(Jsr380Processor processor : processors){
            for(JavaAnnotation annotation : javaParameter.getAnnotations()) {
                if(processor.support(annotation)) {
                    processor.process(javaParameter.getJavaClass(), annotation, parameter);
                }
            }
        }
    }
}

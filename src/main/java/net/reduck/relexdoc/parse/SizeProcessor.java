package net.reduck.relexdoc.parse;

import com.thoughtworks.qdox.model.JavaAnnotation;
import com.thoughtworks.qdox.model.JavaClass;
import com.thoughtworks.qdox.model.JavaField;
import net.reduck.relexdoc.entity.RelaxApiParameter;

/**
 * @author Gin
 * @since 2023/8/4 17:23
 */
public class SizeProcessor implements Jsr380Processor {

    private final String annotationName = "Size";

    @Override
    public boolean process(JavaClass javaClass, JavaAnnotation javaAnnotation, RelaxApiParameter parameter) {
        JavaClass annotationClass = javaAnnotation.getType();
        parameter.setConstraintDesc("长度: " + javaAnnotation.getProperty("min") + " ~ " + javaAnnotation.getProperty("max"));
        return true;
    }

    @Override
    public boolean support(JavaAnnotation javaAnnotation) {
        return javaAnnotation.getType().getName().endsWith(annotationName);
    }
}

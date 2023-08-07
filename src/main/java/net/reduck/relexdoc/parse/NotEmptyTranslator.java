package net.reduck.relexdoc.parse;

import com.thoughtworks.qdox.model.JavaAnnotation;
import com.thoughtworks.qdox.model.JavaClass;
import net.reduck.relexdoc.entity.RelaxApiParameter;

/**
 * @author Gin
 * @since 2023/8/4 17:23
 */
public class NotEmptyTranslator implements Jsr380Translator {
    private final String annotationName = "NotEmpty";

    @Override
    public boolean process(JavaClass fieldType, JavaAnnotation javaAnnotation, RelaxApiParameter parameter) {
        parameter.setRequired(true);
        return true;
    }

    @Override
    public boolean support(JavaAnnotation javaAnnotation) {
        return javaAnnotation.getType().getName().endsWith(annotationName);
    }
}

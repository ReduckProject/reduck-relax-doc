package net.reduck.relexdoc.parse;

import com.thoughtworks.qdox.model.JavaAnnotation;
import com.thoughtworks.qdox.model.JavaClass;
import net.reduck.relexdoc.entity.RelaxApiParameter;

/**
 * @author Gin
 * @since 2023/8/7 10:39
 */
public class MinTranslator implements Jsr380Translator {
    private final String name = "Min";

    @Override
    public boolean process(JavaClass fieldType, JavaAnnotation javaAnnotation, RelaxApiParameter parameter) {
        return false;
    }

    @Override
    public boolean support(JavaAnnotation javaAnnotation) {
        return false;
    }
}

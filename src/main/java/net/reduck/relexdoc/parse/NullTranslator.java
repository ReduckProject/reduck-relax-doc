package net.reduck.relexdoc.parse;

import com.thoughtworks.qdox.model.JavaAnnotation;
import com.thoughtworks.qdox.model.JavaClass;
import net.reduck.relexdoc.entity.RelaxApiParameter;

/**
 * @author Gin
 * @since 2023/8/7 10:37
 */
public class NullTranslator implements Jsr380Translator {
    private final String name = "Null";
    @Override
    public boolean process(JavaClass fieldType, JavaAnnotation javaAnnotation, RelaxApiParameter parameter) {
        parameter.setConstraintDesc("必须为空");
        return true;
    }

    @Override
    public boolean support(JavaAnnotation javaAnnotation) {
        return javaAnnotation.getType().getName().endsWith(name);
    }
}

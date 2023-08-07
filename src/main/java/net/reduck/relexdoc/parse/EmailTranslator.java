package net.reduck.relexdoc.parse;

import com.thoughtworks.qdox.model.JavaAnnotation;
import com.thoughtworks.qdox.model.JavaClass;
import net.reduck.relexdoc.entity.RelaxApiParameter;

/**
 * @author Gin
 * @since 2023/8/7 10:07
 */
public class EmailTranslator implements Jsr380Translator {
    private final String name = "Email";

    @Override
    public boolean process(JavaClass fieldType, JavaAnnotation javaAnnotation, RelaxApiParameter parameter) {
        parameter.setConstraintDesc("格式：邮箱");
        return true;
    }

    @Override
    public boolean support(JavaAnnotation javaAnnotation) {
        return javaAnnotation.getType().getName().endsWith(name);
    }
}

package net.reduck.relexdoc.parse;

import com.thoughtworks.qdox.model.JavaAnnotation;
import com.thoughtworks.qdox.model.JavaClass;
import net.reduck.relexdoc.entity.RelaxApiParameter;

/**
 * @author Gin
 * @since 2023/8/4 17:23
 */
public class SizeTranslator implements Jsr380Translator {

    private final String annotationName = "Size";

    @Override
    public boolean process(JavaClass fieldType, JavaAnnotation javaAnnotation, RelaxApiParameter parameter) {
        JavaClass annotationClass = javaAnnotation.getType();
        parameter.setConstraintDesc(getDesc(javaAnnotation));
        return true;
    }

    @Override
    public boolean support(JavaAnnotation javaAnnotation) {
        return javaAnnotation.getType().getName().endsWith(annotationName);
    }

    private String getDesc(JavaAnnotation size) {
        return "长度: "
                + (size.getProperty("min") == null ? 0 : size.getProperty("min"))
                + " ~ "
                + (size.getProperty("max") == null ? 0x7fffffff : size.getProperty("max"));
    }
}

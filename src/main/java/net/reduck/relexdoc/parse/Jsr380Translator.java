package net.reduck.relexdoc.parse;

import com.thoughtworks.qdox.model.JavaAnnotation;
import com.thoughtworks.qdox.model.JavaClass;
import net.reduck.relexdoc.entity.RelaxApiParameter;

/**
 * @author Gin
 * @since 2023/8/4 17:09
 */
public interface Jsr380Translator {

    boolean process(JavaClass fieldType, JavaAnnotation javaAnnotation, RelaxApiParameter parameter);

    boolean support(JavaAnnotation javaAnnotation);
}

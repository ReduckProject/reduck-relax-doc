package net.reduck.relexdoc.util;

import com.thoughtworks.qdox.model.JavaAnnotatedElement;
import com.thoughtworks.qdox.model.JavaAnnotation;
import com.thoughtworks.qdox.model.JavaMethod;

import java.util.List;

/**
 * @author Gin
 * @since 2023/8/4 17:42
 */
public class Jsr380Utils {

    public static boolean annotationWithValid(JavaAnnotatedElement annotatedElement) {
        List<JavaAnnotation> annotations =  annotatedElement.getAnnotations();

        for(JavaAnnotation annotation : annotations) {
            if(annotation.getType().getName().contains("Valid") || annotation.getType().getName().contains("Validated")){
                return true;
            }
        }

        return false;
    }
}

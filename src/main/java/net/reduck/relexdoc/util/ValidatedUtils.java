package net.reduck.relexdoc.util;

import com.thoughtworks.qdox.model.JavaAnnotatedElement;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Gin
 * @since 2023/7/20 21:52
 */
public class ValidatedUtils {
    private static Set<String> requiredSet = new HashSet<>();

    static {
        requiredSet.add("javax.validation.constraints.NotEmpty");
        requiredSet.add("javax.validation.constraints.NotNull");
        requiredSet.add("javax.validation.constraints.NotBlank");
        requiredSet.add("org.springframework.web.bind.annotation.RestController");
    }

    public static boolean required(JavaAnnotatedElement element) {
        return element.getAnnotations()
                .stream()
                .findFirst()
                .filter(javaAnnotation -> requiredSet.contains(javaAnnotation.getClass().getName()))
                .isPresent();
    }
}

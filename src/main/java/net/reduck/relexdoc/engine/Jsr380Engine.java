package net.reduck.relexdoc.engine;

import com.thoughtworks.qdox.model.JavaAnnotation;
import com.thoughtworks.qdox.model.JavaClass;
import com.thoughtworks.qdox.model.expression.AnnotationValue;
import net.reduck.relexdoc.entity.RelaxApiParameter;
import net.reduck.relexdoc.utils.StringUtil;

import java.util.List;

/**
 * @author Gin
 * @since 2023/8/7 11:47
 */
public class Jsr380Engine {
    private final List<Jsr380Rule> rules;

    public Jsr380Engine(List<Jsr380Rule> rules) {
        this.rules = rules;
    }

    public boolean process(JavaClass fieldType, JavaAnnotation javaAnnotation, RelaxApiParameter parameter) {
        for (Jsr380Rule rule : rules) {
            if (javaAnnotation.getType().getName().contains(".")
                    ? javaAnnotation.getType().getName().endsWith("." + rule.getName())
                    : javaAnnotation.getType().getName().equals(rule.getName())) {

                if (rule.isRequired()) {
                    parameter.setRequired(true);
                }

                if (!StringUtil.isEmpty(rule.getConstraintDesc())) {
                    parameter.setConstraintDesc(StringUtil.isEmpty(parameter.getConstraintDesc())
                            ? fill(rule, javaAnnotation)
                            : "\n" + fill(rule, javaAnnotation));
                }
            }
        }

        return true;
    }

    String fill(Jsr380Rule rule, JavaAnnotation annotation) {
        String desc = rule.getConstraintDesc();
        for (Jsr380Rule.ConstraintVariable variable : rule.getConstraintVariables()) {
            AnnotationValue annotationValue = annotation.getProperty(variable.getName());
            desc = desc.replace(variable.getReplace(), annotationValue == null ? variable.getDefaultValue() : annotationValue.toString());
        }
        return desc;
    }
}

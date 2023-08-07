package net.reduck.relexdoc.engine;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Gin
 * @since 2023/8/7 11:48
 */
@Data
@Accessors(chain = true)
public class Jsr380Rule {

    private String name;

    private List<String> type = new ArrayList<>();

    private boolean required;

    private String constraintDesc;

    private List<ConstraintVariable> constraintVariables = new ArrayList<>();

    @Data
    public static class ConstraintVariable {
        private String name;

        private String replace;

        private String defaultValue;
    }
}

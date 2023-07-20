package net.reduck.relexdoc.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Gin
 * @since 2023/7/20 14:32
 */
@Data
@Accessors(chain = true)
public class RelaxApiParameter {
    private String name;

    private String type;

    private String requireDesc;

    private String constraintDesc;

    private String desc;

    private String example;
}

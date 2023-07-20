package net.reduck.relexdoc.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Gin
 * @since 2023/7/20 16:12
 */
@Data
@Accessors(chain = true)
public class RelaxApiGroup {
    private String name;

    private String urlPrefix;

    private List<RelaxApi> apis = new ArrayList<>();
}

package net.reduck.relexdoc.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Gin
 * @since 2023/7/20 14:35
 */
@Data
@Accessors(chain = true)
public class RelaxApi {

    private String name;

    private String url;

    private String desc;

    private String requestMethod;

    private String contentType;

    private List<RelaxApiParameter> requestParams = new ArrayList<>();

    private List<RelaxApiParameter> responseParams = new ArrayList<>();

}

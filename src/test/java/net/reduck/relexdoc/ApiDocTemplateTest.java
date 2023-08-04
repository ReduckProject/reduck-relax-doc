package net.reduck.relexdoc;

import net.reduck.relexdoc.entity.RelaxApi;
import net.reduck.relexdoc.entity.RelaxApiGroup;
import net.reduck.relexdoc.entity.RelaxApiParameter;
import org.beetl.core.Configuration;
import org.beetl.core.GroupTemplate;
import org.beetl.core.Template;
import org.beetl.core.resource.StringTemplateResourceLoader;
import org.junit.jupiter.api.Test;
import org.springframework.util.FileCopyUtils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author Gin
 * @since 2023/7/20 14:36
 */
public class ApiDocTemplateTest {

    @Test
    public void test() throws IOException {
        RelaxApiGroup apiGroup =new RelaxApiGroup();
        apiGroup.setName("用户接口").setUrlPrefix("/user");

        RelaxApi api = new RelaxApi();

        api.setName("新增");
        api.setUrl("/add");
        api.setRequestMethod("POST");
        api.setContentType("application/json");

        RelaxApiParameter parameter = new RelaxApiParameter();
        parameter.setName("username");
        parameter.setType("String");
        parameter.setDesc("用户名");
        parameter.setRequireDesc("是");
        parameter.setConstraintDesc("长度 8 - 20");
        parameter.setExample("ginscooo");

        api.setRequestParams(Arrays.asList(parameter, parameter, parameter));
        api.setResponseParams(Arrays.asList(parameter, parameter, parameter));

        apiGroup.getApis().add(api);
        apiGroup.getApis().add(api);
        apiGroup.getApis().add(api);
        apiGroup.getApis().add(api);

        StringTemplateResourceLoader resourceLoader = new StringTemplateResourceLoader();
        Configuration cfg = Configuration.defaultConfiguration();
        cfg.add(new File("/Users/zhanjinkai/Documents/GitHub/reduck-relax-doc/src/main/resources/relax-doc-beetl.properties"));
        GroupTemplate gt = new GroupTemplate(resourceLoader, cfg);
        Template t = gt.getTemplate(FileCopyUtils.copyToString(new FileReader("/Users/zhanjinkai/Documents/GitHub/reduck-relax-doc/src/main/resources/apiDoc.md")));

        t.binding("apiGroupList", Arrays.asList(apiGroup));
//渲染结果
        String str = t.render();
        System.out.println(str);

    }

}

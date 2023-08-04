package net.reduck.relexdoc;

import com.thoughtworks.qdox.JavaProjectBuilder;
import com.thoughtworks.qdox.model.JavaClass;
import com.thoughtworks.qdox.model.JavaMethod;
import net.reduck.relexdoc.entity.RelaxApi;
import net.reduck.relexdoc.entity.RelaxApiGroup;
import net.reduck.relexdoc.template.TemplateWriter;
import net.reduck.relexdoc.util.ProjectBuilderLoader;
import net.reduck.relexdoc.util.SpringAnnotationHelper;
import net.reduck.relexdoc.util.SpringMvcApiParser;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Gin
 * @since 2023/7/20 16:21
 */
public class SpringMvcApiParserTest {

    @Test
    public void testParser() throws IOException {
        JavaProjectBuilder builder = new JavaProjectBuilder();
        ProjectBuilderLoader.load(builder, new File("/Users/zhanjinkai/Documents/Gitee/x-www-form-urlencoded/src/main/java/com/example/xwwwformurlencoded"));

        List<RelaxApiGroup> apiGroups = new ArrayList<>();
        for (JavaClass javaClass : builder.getClasses()) {
            if (SpringAnnotationHelper.containsController(javaClass)) {

                RelaxApiGroup apiGroup = new RelaxApiGroup();
                apiGroup.setUrlPrefix(SpringMvcApiParser.url(javaClass));
                String comment = SpringMvcApiParser.comment(javaClass);
                apiGroup.setName(comment == null || "".equals(comment) ? javaClass.getSimpleName() : comment);

                for (JavaMethod javaMethod : javaClass.getMethods()) {
                    RelaxApi api = new RelaxApi();
                    api.setUrl(SpringMvcApiParser.url(javaMethod));

                    comment = SpringMvcApiParser.comment(javaMethod);
                    api.setDesc(comment == null || comment.equals("")? javaMethod.getName() : comment)
                            .setName(api.getDesc())
                            .setRequestParams(SpringMvcApiParser.requestParameter(javaMethod))
                            .setRequestMethod(SpringMvcApiParser.requestMethod(javaMethod))
                            .setResponseParams(SpringMvcApiParser.responseParameter(javaMethod))
                    ;

                    apiGroup.getApis().add(api);
                }

                apiGroups.add(apiGroup);
            }
        }


//        StringTemplateResourceLoader resourceLoader = new StringTemplateResourceLoader();
//        Configuration cfg = Configuration.defaultConfiguration();
//        cfg.add(new File("/Users/zhanjinkai/Documents/GitHub/reduck-relax-doc/src/main/resources/relax-doc-beetl.properties"));
//
//        GroupTemplate gt = new GroupTemplate(resourceLoader, cfg);
////获取模板
//        Template t = gt.getTemplate(FileCopyUtils.copyToString(new FileReader("/Users/zhanjinkai/Documents/GitHub/reduck-relax-doc/src/main/resources/apiDoc.md")));
//
//        t.binding("apiGroupList", apiGroups);
////渲染结果
//        String str = t.render();
//        System.out.println(str);

        Map<String ,Object> binds = new HashMap<>();
        binds.put("apiGroupList", apiGroups);

        TemplateWriter.write("/Users/zhanjinkai/Documents/GitHub/reduck-relax-doc/src/main/resources/apiDoc.md"
        , "/Users/zhanjinkai/Documents/GitHub/reduck-relax-doc/src/main/resources/example.md"
        , "/Users/zhanjinkai/Documents/GitHub/reduck-relax-doc/src/main/resources/relax-doc-beetl.properties"
                , binds
        );
    }
}

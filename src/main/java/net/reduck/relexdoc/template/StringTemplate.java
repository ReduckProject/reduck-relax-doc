package net.reduck.relexdoc.template;

import org.beetl.core.Configuration;
import org.beetl.core.GroupTemplate;
import org.beetl.core.Template;
import org.beetl.core.resource.StringTemplateResourceLoader;

import java.io.IOException;

/**
 * @author Gin
 * @since 2023/7/18 20:38
 */
public class StringTemplate {

    public static void tp() throws IOException {
        StringTemplateResourceLoader resourceLoader = new StringTemplateResourceLoader();
        Configuration cfg = Configuration.defaultConfiguration();
        GroupTemplate gt = new GroupTemplate(resourceLoader, cfg);
//获取模板
        Template t = gt.getTemplate("hello,${name}");
        t.binding("name", "beetl");
//渲染结果
        String str = t.render();
        System.out.println(str);
    }

    public static void main(String[] args) throws IOException {
        tp();
    }
}

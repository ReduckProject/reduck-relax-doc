package net.reduck.relexdoc.template;

import org.beetl.core.Configuration;
import org.beetl.core.GroupTemplate;
import org.beetl.core.Template;
import org.beetl.core.resource.FileResourceLoader;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

/**
 * @author Gin
 * @since 2023/7/20 20:28
 */
public class TemplateWriter {

    public static void write(String templatePath, String outputPath, String configPath, Map<String,Object> bindParams) throws IOException {
        FileResourceLoader resourceLoader = new FileResourceLoader();
        resourceLoader.setRoot("/");
        Configuration cfg = Configuration.defaultConfiguration();
        cfg.add(new File(configPath));

        GroupTemplate gt = new GroupTemplate(resourceLoader, cfg);
        Template t = gt.getTemplate(templatePath);
        for(Map.Entry<String,Object> entry : bindParams.entrySet()) {
            t.binding(entry.getKey(), entry.getValue());
        }

        File out = new File(outputPath);
        if(!out.getParentFile().exists()) {
            out.mkdirs();
        }

        t.renderTo(new FileOutputStream(out));

    }
}

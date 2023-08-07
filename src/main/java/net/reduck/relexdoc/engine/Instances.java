package net.reduck.relexdoc.engine;

import net.reduck.relexdoc.utils.StringUtil;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Gin
 * @since 2023/8/7 14:54
 */
public class Instances {

    static {
        try {
            URL url = ClassLoader.getSystemClassLoader().getResource("jsr380.conf");
            BufferedReader reader = new BufferedReader(new InputStreamReader(Files.newInputStream(Paths.get(url.toURI()))));

            String tmp;
            reader.readLine();
            List<Jsr380Rule> rules = new ArrayList<>();
            while ((tmp = reader.readLine()) != null) {
                SeparatorReader separatorReader = new SeparatorReader("|", tmp);
                Jsr380Rule rule = new Jsr380Rule();
                rule.setName(separatorReader.nextTrim());
                if(StringUtil.isEmpty(rule.getName())) {
                    continue;
                }
                separatorReader.nextTrim();
                rule.setRequired("true".equalsIgnoreCase(separatorReader.nextTrim()));
                rule.setConstraintDesc(separatorReader.nextTrim());
                rule.setConstraintVariables(ElParser.parse(rule.getConstraintDesc()));
                rules.add(rule);
            }
            jsr380Engine = new Jsr380Engine(rules);
        } catch (URISyntaxException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Jsr380Engine jsr380Engine;
}

package net.reduck.relexdoc;

import net.reduck.relexdoc.engine.ElParser;
import net.reduck.relexdoc.engine.Jsr380Rule;
import net.reduck.relexdoc.engine.SeparatorReader;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Gin
 * @since 2023/8/7 14:01
 */
public class Jsr380EngineTest {

    @Test
    public void testConfigParse() throws IOException, URISyntaxException {
        List<Jsr380Rule> rules = new ArrayList<>();

        String path = "jsr380.conf";

        URL url = ClassLoader.getSystemClassLoader().getResource(path);
        BufferedReader reader = new BufferedReader(new InputStreamReader(Files.newInputStream(Paths.get(url.toURI()))));

        String tmp;
        reader.readLine();
        while ((tmp = reader.readLine()) != null) {
            SeparatorReader separatorReader = new SeparatorReader("|", tmp);
            Jsr380Rule rule = new Jsr380Rule();
            rule.setName(separatorReader.nextTrim());
            separatorReader.nextTrim();
            rule.setRequired("true".equalsIgnoreCase(separatorReader.nextTrim()));
            rule.setConstraintDesc(separatorReader.nextTrim());
            rule.setConstraintVariables(ElParser.parse(rule.getConstraintDesc()));

            System.out.println(rule.toString());
        }
    }

    @Test
    public void testTerminalSeparator() {

        SeparatorReader reader = new SeparatorReader("||", "|||true||test||||333");
        while (true){
            String next = reader.next();
            if(next != null) {
                System.out.println(next);
            }else {
                break;
            }
        }

        System.out.println("true|test||||333|||||".split("\\|").length);
    }
}

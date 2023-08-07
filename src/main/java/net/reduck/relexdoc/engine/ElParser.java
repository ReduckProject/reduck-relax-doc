package net.reduck.relexdoc.engine;

import net.reduck.relexdoc.utils.StringUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Gin
 * @since 2023/8/7 12:05
 */
public class ElParser {


    public static List<Jsr380Rule.ConstraintVariable> parse(String content) {
        List<Jsr380Rule.ConstraintVariable> variables = new ArrayList<>();
        if(StringUtil.isEmpty(content)) {
            return variables;
        }
        char[] chars = content.toCharArray();

        int start = -1;
        for (int i = 0; i < chars.length; i++) {
            if (start > 0) {
                if (chars[i] == '}') {
                    variables.add(build(start, i, content));
                    start = -1;
                }
            } else {
                if (chars[i] == '$' && i < chars.length - 1 && chars[i + 1] == '{') {
                    start = i;
                }
            }
        }

        return variables;
    }

    /**
     *
     * @param start
     * @param end
     * @param content
     * @return
     */
    static Jsr380Rule.ConstraintVariable build(int start, int end, String content) {
        Jsr380Rule.ConstraintVariable variable = new Jsr380Rule.ConstraintVariable();

        // replace格式为:${content}
        String replace = content.substring(start, end + 1);
        variable.setReplace(replace);

        int index = replace.indexOf(":");
        if (index != -1) {
            variable.setName(replace.substring(2, index));
            variable.setDefaultValue(replace.substring(index + 1, replace.length() - 1));
        } else {
            variable.setName(replace.substring(2, replace.length() - 1));
            variable.setDefaultValue("");
        }

        return variable;
    }

}

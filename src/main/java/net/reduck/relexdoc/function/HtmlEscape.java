package net.reduck.relexdoc.function;

import org.beetl.core.Context;
import org.beetl.core.Function;

/**
 * @author Gin
 * @since 2023/7/20 20:19
 */
public class HtmlEscape implements Function {

    @Override
    public Object call(Object[] paras, Context ctx) {
        Object para0 = paras[0];
        if(para0 == null){
            return "";
        }
        // 将换行替换成<br>
        return para0.toString()
                .replaceAll("\n|\r\n|\r", "<br>")
                // 必须先进行替换
                .replaceAll("&", "&amp;")
                .replaceAll(" ", "&nbsp;")
                .replaceAll("\"", "&quot;")
                .replaceAll("<", "&lt;")
                .replaceAll(">", "&gt;")
                ;
    }

    private String lineSeparatorEscape(String content) {
        return content.replaceAll("\n|\r\n|\r", "<br>");
    }

    private String spaceEscape(String content) {
        return content.replaceAll(" ", "&nbsp;");
    }

    private String quoteEscape(String content) {
        return content.replaceAll("\"", "&quot;");
    }
}

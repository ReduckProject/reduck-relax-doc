package net.reduck.relexdoc.function;

import org.beetl.core.Context;
import org.beetl.core.Function;

/**
 * @author Gin
 * @since 2023/7/20 20:19
 */
public class HtmlLineEscape implements Function {

    @Override
    public Object call(Object[] paras, Context ctx) {
        Object para0 = paras[0];
        if(para0 == null){
            return "";
        }
        return para0.toString().replace("\n", "<br>");
    }
}

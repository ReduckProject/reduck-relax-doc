package net.reduck.relexdoc.function;

import org.beetl.core.Context;
import org.beetl.core.Function;

/**
 * @author Gin
 * @since 2023/8/4 16:45
 */
public class HtmlSpaceEscape implements Function {

    @Override
    public Object call(Object[] paras, Context ctx) {
        Object para0 = paras[0];
        if(para0 == null){
            return "";
        }
        // 将换行替换成<br>
        return para0.toString()
                .replaceAll(" ", "&nbsp;")
                ;
    }
}

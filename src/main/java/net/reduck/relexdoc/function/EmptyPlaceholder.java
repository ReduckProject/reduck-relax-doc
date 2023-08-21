package net.reduck.relexdoc.function;

import net.reduck.relexdoc.utils.StringUtil;
import org.beetl.core.Context;
import org.beetl.core.Function;

/**
 * @author Gin
 * @since 2023/8/21 10:27
 */
public class EmptyPlaceholder implements Function {

    @Override
    public Object call(Object[] paras, Context ctx) {
        Object para0 = paras[0];
        if (para0 == null) {
            return "";
        }
        if (StringUtil.isEmpty(para0.toString())) {
            return " ";
        }
        return para0.toString();
    }

}

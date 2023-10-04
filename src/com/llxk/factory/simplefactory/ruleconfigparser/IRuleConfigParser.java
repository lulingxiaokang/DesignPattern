package com.llxk.factory.simplefactory.ruleconfigparser;

import com.llxk.factory.simplefactory.RuleConfig;

/**
 * ClassName: IRuleConfigParser
 * Package: com.llxk.factory.simplefactory
 *
 * @author 庐陵小康
 * @version 1.0
 * @Desc
 * @Date 2023/9/30 22:50
 */
public interface IRuleConfigParser {
    RuleConfig parse(String configText);
}

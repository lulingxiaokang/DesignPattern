package com.llxk.factory.simplefactory.ruleconfigparser;

import com.llxk.factory.simplefactory.RuleConfig;

/**
 * ClassName: JsonRuleConfigParser
 * Package: com.llxk.factory.simplefactory
 *
 * @author 庐陵小康
 * @version 1.0
 * @Desc
 * @Date 2023/9/30 22:55
 */
public class JsonRuleConfigParser implements IRuleConfigParser {
    @Override
    public RuleConfig parse(String configText) {
        return new RuleConfig("json");
    }
}

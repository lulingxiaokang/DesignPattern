package com.llxk.factory.simplefactory.ruleconfigparser;

import com.llxk.factory.simplefactory.RuleConfig;

/**
 * ClassName: YamlRuleConfigParser
 * Package: com.llxk.factory.simplefactory
 *
 * @author 庐陵小康
 * @version 1.0
 * @Desc
 * @Date 2023/9/30 22:58
 */
public class YamlRuleConfigParser implements IRuleConfigParser {
    @Override
    public RuleConfig parse(String configText) {
        return new RuleConfig("yaml");
    }
}

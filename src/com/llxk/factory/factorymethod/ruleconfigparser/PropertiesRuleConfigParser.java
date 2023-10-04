package com.llxk.factory.factorymethod.ruleconfigparser;

import com.llxk.factory.factorymethod.RuleConfig;

/**
 * ClassName: PropertiesRuleConfigParser
 * Package: com.llxk.factory.simplefactory
 *
 * @author 庐陵小康
 * @version 1.0
 * @Desc
 * @Date 2023/9/30 22:58
 */
public class PropertiesRuleConfigParser implements IRuleConfigParser{
    @Override
    public RuleConfig parse(String configText) {
        return new RuleConfig("properties");
    }
}

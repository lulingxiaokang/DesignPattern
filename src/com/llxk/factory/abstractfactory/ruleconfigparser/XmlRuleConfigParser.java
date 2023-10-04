package com.llxk.factory.abstractfactory.ruleconfigparser;

import com.llxk.factory.abstractfactory.Config;

/**
 * ClassName: XmlRuleConfigParser
 * Package: com.llxk.factory.simplefactory
 *
 * @author 庐陵小康
 * @version 1.0
 * @Desc
 * @Date 2023/9/30 22:57
 */
public class XmlRuleConfigParser implements IRuleConfigParser {

    @Override
    public Config parse(String configText) {
        return new Config("rule-xml");
    }
}

package com.llxk.factory.factorymethod.ruleconfigparserfactory;

import com.llxk.factory.factorymethod.ruleconfigparser.IRuleConfigParser;
import com.llxk.factory.factorymethod.ruleconfigparser.YamlRuleConfigParser;

/**
 * ClassName: YamlRuleConfigParserFactory
 * Package: com.llxk.factory.factorymethod
 *
 * @author 庐陵小康
 * @version 1.0
 * @Desc
 * @Date 2023/9/30 23:17
 */
public class YamlRuleConfigParserFactory implements IRuleConfigParserFactory{
    @Override
    public IRuleConfigParser createParser() {
        return new YamlRuleConfigParser();
    }
}

package com.llxk.factory.factorymethod.ruleconfigparserfactory;

import com.llxk.factory.factorymethod.ruleconfigparser.IRuleConfigParser;
import com.llxk.factory.factorymethod.ruleconfigparser.PropertiesRuleConfigParser;

/**
 * ClassName: PropertiesRuleConfigParserFactory
 * Package: com.llxk.factory.factorymethod
 *
 * @author 庐陵小康
 * @version 1.0
 * @Desc
 * @Date 2023/9/30 23:18
 */
public class PropertiesRuleConfigParserFactory implements IRuleConfigParserFactory{
    @Override
    public IRuleConfigParser createParser() {
        return new PropertiesRuleConfigParser();
    }
}

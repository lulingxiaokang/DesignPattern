package com.llxk.factory.abstractfactory.configparserfactory;

import com.llxk.factory.abstractfactory.ruleconfigparser.IRuleConfigParser;
import com.llxk.factory.abstractfactory.ruleconfigparser.PropertiesRuleConfigParser;
import com.llxk.factory.abstractfactory.systemconfigparser.ISystemConfigParser;
import com.llxk.factory.abstractfactory.systemconfigparser.PropertiesSystemConfigParser;

/**
 * ClassName: PropertiesConfigParserFactory
 * Package: com.llxk.factory.abstractfactory.configparserfactory
 *
 * @author 庐陵小康
 * @version 1.0
 * @Desc
 * @Date 2023/9/30 23:49
 */
public class PropertiesConfigParserFactory implements IConfigParserFactory{
    @Override
    public IRuleConfigParser createRuleParser() {
        return new PropertiesRuleConfigParser();
    }

    @Override
    public ISystemConfigParser createSystemParser() {
        return new PropertiesSystemConfigParser();
    }
}

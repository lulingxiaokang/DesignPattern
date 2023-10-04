package com.llxk.factory.abstractfactory.configparserfactory;

import com.llxk.factory.abstractfactory.ruleconfigparser.IRuleConfigParser;
import com.llxk.factory.abstractfactory.ruleconfigparser.XmlRuleConfigParser;
import com.llxk.factory.abstractfactory.systemconfigparser.ISystemConfigParser;
import com.llxk.factory.abstractfactory.systemconfigparser.XmlSystemConfigParser;

/**
 * ClassName: XmlConfigParserFactory
 * Package: com.llxk.factory.abstractfactory.configparserfactory
 *
 * @author 庐陵小康
 * @version 1.0
 * @Desc
 * @Date 2023/9/30 23:47
 */
public class XmlConfigParserFactory implements IConfigParserFactory{
    @Override
    public IRuleConfigParser createRuleParser() {
        return new XmlRuleConfigParser();
    }

    @Override
    public ISystemConfigParser createSystemParser() {
        return new XmlSystemConfigParser();
    }
}

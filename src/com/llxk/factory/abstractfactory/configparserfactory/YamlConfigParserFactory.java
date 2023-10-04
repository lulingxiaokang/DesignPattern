package com.llxk.factory.abstractfactory.configparserfactory;

import com.llxk.factory.abstractfactory.ruleconfigparser.IRuleConfigParser;
import com.llxk.factory.abstractfactory.ruleconfigparser.YamlRuleConfigParser;
import com.llxk.factory.abstractfactory.systemconfigparser.ISystemConfigParser;
import com.llxk.factory.abstractfactory.systemconfigparser.YamlSystemConfigParser;

/**
 * ClassName: YamlConfigParserFactory
 * Package: com.llxk.factory.abstractfactory.configparserfactory
 *
 * @author 庐陵小康
 * @version 1.0
 * @Desc
 * @Date 2023/9/30 23:48
 */
public class YamlConfigParserFactory implements IConfigParserFactory{
    @Override
    public IRuleConfigParser createRuleParser() {
        return new YamlRuleConfigParser();
    }

    @Override
    public ISystemConfigParser createSystemParser() {
        return new YamlSystemConfigParser();
    }
}

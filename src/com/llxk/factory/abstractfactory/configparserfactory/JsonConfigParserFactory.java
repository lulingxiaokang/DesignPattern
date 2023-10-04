package com.llxk.factory.abstractfactory.configparserfactory;

import com.llxk.factory.abstractfactory.ruleconfigparser.IRuleConfigParser;
import com.llxk.factory.abstractfactory.ruleconfigparser.JsonRuleConfigParser;
import com.llxk.factory.abstractfactory.systemconfigparser.ISystemConfigParser;
import com.llxk.factory.abstractfactory.systemconfigparser.JsonSystemConfigParser;

/**
 * ClassName: JsonConfigParserFactory
 * Package: com.llxk.factory.abstractfactory.configparserfactory
 *
 * @author 庐陵小康
 * @version 1.0
 * @Desc
 * @Date 2023/9/30 23:46
 */
public class JsonConfigParserFactory implements IConfigParserFactory{
    @Override
    public IRuleConfigParser createRuleParser() {
        return new JsonRuleConfigParser();
    }

    @Override
    public ISystemConfigParser createSystemParser() {
        return new JsonSystemConfigParser();
    }
}

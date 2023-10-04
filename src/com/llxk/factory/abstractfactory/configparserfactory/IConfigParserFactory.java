package com.llxk.factory.abstractfactory.configparserfactory;

import com.llxk.factory.abstractfactory.ruleconfigparser.IRuleConfigParser;
import com.llxk.factory.abstractfactory.systemconfigparser.ISystemConfigParser;

/**
 * ClassName: IConfigParserFactory
 * Package: com.llxk.factory.abstractfactory.configparserfactory
 *
 * @author 庐陵小康
 * @version 1.0
 * @Desc
 * @Date 2023/9/30 23:45
 */
public interface IConfigParserFactory {
    IRuleConfigParser createRuleParser();
    ISystemConfigParser createSystemParser();
    //此处可以扩展新的parser类型，比如IBizConfigParser
}

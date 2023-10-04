package com.llxk.factory.factorymethod.ruleconfigparserfactory;

import com.llxk.factory.factorymethod.ruleconfigparser.IRuleConfigParser;

/**
 * ClassName: IRuleConfigParserFactory
 * Package: com.llxk.factory.factorymethod
 *
 * @author 庐陵小康
 * @version 1.0
 * @Desc
 * @Date 2023/9/30 23:15
 */
public interface IRuleConfigParserFactory {
    IRuleConfigParser createParser();
}

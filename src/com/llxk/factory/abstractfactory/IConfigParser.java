package com.llxk.factory.abstractfactory;

/**
 * ClassName: ConfigParser
 * Package: com.llxk.factory.abstractfactory.configparserfactory
 *
 * @author 庐陵小康
 * @version 1.0
 * @Desc
 * @Date 2023/10/1 0:16
 */
public interface IConfigParser {
    Config parse(String configText);
}

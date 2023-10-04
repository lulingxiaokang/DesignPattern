package com.llxk.factory.abstractfactory.systemconfigparser;

import com.llxk.factory.abstractfactory.Config;

/**
 * ClassName: PropertiesSystemConfigParser
 * Package: com.llxk.factory.abstractfactory.systemconfigparser
 *
 * @author 庐陵小康
 * @version 1.0
 * @Desc
 * @Date 2023/9/30 23:41
 */
public class PropertiesSystemConfigParser implements ISystemConfigParser{
    @Override
    public Config parse(String configText) {
        return new Config("system-properties");
    }
}

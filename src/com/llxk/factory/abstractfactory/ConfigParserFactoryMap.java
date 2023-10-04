package com.llxk.factory.abstractfactory;

import com.llxk.factory.abstractfactory.configparserfactory.*;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: ConfigParserFactoryMap
 * Package: com.llxk.factory.abstractfactory
 *
 * @author 庐陵小康
 * @version 1.0
 * @Desc
 * @Date 2023/9/30 23:57
 */
public class ConfigParserFactoryMap {
    private static final Map<String, IConfigParserFactory> cachedFactories = new HashMap<>();

    static {
        cachedFactories.put("rule", new JsonConfigParserFactory());
        cachedFactories.put("xml", new XmlConfigParserFactory());
        cachedFactories.put("yaml", new YamlConfigParserFactory());
        cachedFactories.put("properties", new PropertiesConfigParserFactory());
    }

    public static IConfigParserFactory getParserFactory(String type) {
        if (type == null || type.isEmpty()) {
            return null;
        }
        IConfigParserFactory parserFactory = cachedFactories.get(type.toLowerCase());
        return parserFactory;
    }
}

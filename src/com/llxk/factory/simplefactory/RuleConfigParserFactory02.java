package com.llxk.factory.simplefactory;

import com.llxk.factory.simplefactory.ruleconfigparser.*;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: RuleConfigParserFactory02
 * Package: com.llxk.factory.simplefactory
 *
 * @author 庐陵小康
 * @version 1.0
 * @Desc 简单工厂模式的第二种实现方法
 * @Date 2023/9/30 23:00
 */
public class RuleConfigParserFactory02 {

        private static final Map<String, IRuleConfigParser> cachedParsers = new HashMap<>();

        static {
            cachedParsers.put("json", new JsonRuleConfigParser());
            cachedParsers.put("xml", new XmlRuleConfigParser());
            cachedParsers.put("yaml", new YamlRuleConfigParser());
            cachedParsers.put("properties", new PropertiesRuleConfigParser());
        }

        public static IRuleConfigParser createParser(String configFormat) {
            if (configFormat == null || configFormat.isEmpty()) {
                return null;//返回null还是IllegalArgumentException全凭你自己说了算
            }
            IRuleConfigParser parser = cachedParsers.get(configFormat.toLowerCase());
            return parser;
        }

}

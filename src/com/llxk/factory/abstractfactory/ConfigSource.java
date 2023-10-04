package com.llxk.factory.abstractfactory;

import com.llxk.factory.abstractfactory.configparserfactory.IConfigParserFactory;

/**
 * ClassName: ConfigSource
 * Package: com.llxk.factory.abstractfactory
 *
 * @author 庐陵小康
 * @version 1.0
 * @Desc
 * @Date 2023/10/1 0:01
 */
public class ConfigSource {
    public Config load(String configFilePath) {
        String configFileExtension = getFileExtension(configFilePath);

        IConfigParserFactory parserFactory = ConfigParserFactoryMap.getParserFactory(configFileExtension);
        if (parserFactory == null) {
            throw new InvalidRuleConfigException("config file format is not supported: " + configFilePath);
        }
        String configFileconfig = getFileConfig(configFilePath);
        IConfigParser parser = null;
        if("rule".equals(configFileconfig)){
            parser = parserFactory.createRuleParser();
        }else if("system".equals(configFileconfig)){
            parser = parserFactory.createSystemParser();
        }else{
            throw new InvalidRuleConfigException("config file format is not supported: " + configFilePath);
        }


        String configText = "";
        //从ruleConfigFilePath文件中读取配置文本到configText中
        Config ruleConfig = parser.parse(configText);
        return ruleConfig;
    }

    private String getFileExtension(String filePath) {
        //...解析文件名获取扩展名，比如rule.json，返回json
        return "json";
    }

    private String getFileConfig(String filePath) {
        //...解析文件名获取文件格式，Rule 规则配置还是 System 系统配置
        return "rule";
    }

}

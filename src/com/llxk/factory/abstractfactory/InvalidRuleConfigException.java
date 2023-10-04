package com.llxk.factory.abstractfactory;

/**
 * ClassName: InvalidRuleConfigException
 * Package: com.llxk.factory.simplefactory
 *
 * @author 庐陵小康
 * @version 1.0
 * @Desc
 * @Date 2023/9/30 22:53
 */
public class InvalidRuleConfigException extends RuntimeException{
    public InvalidRuleConfigException() {
    }

    public InvalidRuleConfigException(String message) {
        super(message);
    }
}

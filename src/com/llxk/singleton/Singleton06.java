package com.llxk.singleton;

/**
 * ClassName: Singleton06
 * Package: com.llxk.singleton
 *
 * @author 庐陵小康
 * @version 1.0
 * @Desc
 * @Date 2023/9/26 0:04
 */
public class Singleton06 {
}

//静态内部类方式
class Lazy4{
    private Lazy4(){};


    private static class SingletonInstance{
        private static final Lazy4 INSTANCE = new Lazy4();
    }

    public static Lazy4 getInstance(){
        return SingletonInstance.INSTANCE;
    }

}

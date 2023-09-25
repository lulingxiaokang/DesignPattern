package com.llxk.singleton;

/**
 * ClassName: Singleton05
 * Package: com.llxk.singleton
 *
 * @author 庐陵小康
 * @version 1.0
 * @Desc
 * @Date 2023/9/25 23:54
 */
public class Singleton05 {
}
class Lazy3{
    private static volatile Lazy3 instance;
    private Lazy3(){};

    //提供一个静态的公有方法，当使用到该方法时，才去创建instance
    //即懒汉式
    // 双重检查，解决线程安全问题，同时解决懒加载问题
    public static Lazy3 getInstance(){
        if(instance == null){
            synchronized (Lazy3.class){
                if(instance == null) {
                    instance = new Lazy3();
                }
            }
        }

        return instance;
    }


}


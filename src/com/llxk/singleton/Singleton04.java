package com.llxk.singleton;

/**
 * ClassName: Singleton04
 * Package: com.llxk.singleton
 *
 * @author 庐陵小康
 * @version 1.0
 * @Desc
 * @Date 2023/9/25 23:51
 */
public class Singleton04 {
    public static void main(String[] args) {
        Lazy2 instance = Lazy2.getInstance();
        Lazy2 instance2 = Lazy2.getInstance();
        System.out.println(instance == instance2);// true
    }

}
class Lazy2{
    private static Lazy2 instance;
    private Lazy2(){};

    //提供一个静态的公有方法，当使用到该方法时，才去创建instance
    //即懒汉式
    // 同步方法实现线程安全问题
    public static synchronized Lazy2 getInstance(){
        if(instance == null){
            instance = new Lazy2();
        }
        return instance;
    }

}
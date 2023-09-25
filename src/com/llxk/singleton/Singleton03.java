package com.llxk.singleton;

/**
 * ClassName: Singleton03
 * Package: com.llxk.singleton
 *
 * @author 庐陵小康
 * @version 1.0
 * @Desc
 * @Date 2023/9/25 23:44
 */
public class Singleton03 {
    public static void main(String[] args) {
        Lazy1 instance = Lazy1.getInstance();
        Lazy1 instance2 = Lazy1.getInstance();
        System.out.println(instance == instance2);// true
    }
}

class Lazy1{
    private static Lazy1 instance;
    private Lazy1(){};

    //提供一个静态的公有方法，当使用到该方法时，才去创建instance
    //即懒汉式
    // 线程不安全写法
    public static Lazy1 getInstance(){
        if(instance == null){
            instance = new Lazy1();
        }
        return instance;
    }

}
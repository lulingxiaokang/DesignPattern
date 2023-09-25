package com.llxk.singleton;

/**
 * ClassName: Singleton02
 * Package: com.llxk.singleton
 *
 * @author 庐陵小康
 * @version 1.0
 * @Desc
 * @Date 2023/9/25 23:38
 */
public class Singleton02 {
    public static void main(String[] args) {
        Hungry2 instance = Hungry2.getInstance();
        Hungry2 instance2 = Hungry2.getInstance();
        System.out.println(instance == instance2);// true
    }
}

//饿汉式(静态代码块)

class Hungry2{
    //1. 构造器私有化，外部不能new
    private Hungry2(){

    }
    //2. 本类内部创建对象实例
    private static Hungry2 instance;
    static {// 在静态代码块中，创建单例对象

        instance = new Hungry2();
    }

    //3. 提供一个公有的静态方法，返回实例对象
    public static Hungry2 getInstance(){
        return instance;
    }
}

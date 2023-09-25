package com.llxk.singleton;

/**
 * ClassName: Singleton01
 * Package: com.llxk.singleton
 *
 * @author 庐陵小康
 * @version 1.0
 * @Desc
 * @Date 2023/9/25 23:28
 */
public class Singleton01 {
    public static void main(String[] args) {
        Hungry1 instance = Hungry1.getInstance();
        Hungry1 instance2 = Hungry1.getInstance();
        System.out.println(instance == instance2);// true
    }
}

//饿汉式(静态变量)

class Hungry1{
    //1. 构造器私有化，外部不能new
    private Hungry1(){

    }
    //2. 本类内部创建对象实例
    private final static Hungry1 INSTANCE = new Hungry1();

    //3. 提供一个公有的静态方法，返回实例对象
    public static Hungry1 getInstance(){
        return INSTANCE;
    }
}
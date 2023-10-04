package com.llxk.singleton;

/**
 * ClassName: Singleton07
 * Package: com.llxk.singleton
 *
 * @author 庐陵小康
 * @version 1.0
 * @Desc
 * @Date 2023/9/26 0:10
 */
public class Singleton07 {
    public static void main(String[] args) {
        Enum instance = Enum.INSTANCE;
        Enum instance2 = Enum.INSTANCE;
        System.out.println(instance == instance2);
    }
}
//枚举
//不仅能够避免多线程同步问题，而且还能防止反序列化重新创建新对象
enum Enum{
    INSTANCE;//属性
    public void method(){
        //方法
        System.out.println("ok~");
    }
}
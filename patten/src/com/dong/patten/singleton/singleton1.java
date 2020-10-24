package com.dong.patten.singleton;

/**
 * @author 雪浪风尘
 * @Remember Keep thinking
 * 饿汉式
 * 类加载到内存后，就实例化一个单例，JVM保证线程安全。
 * 缺点:不管用到与否，类加载的时候就完成实例化
 */
public class singleton1 {
    private static final singleton1 INSTANCE=new singleton1();//定义一个静态的实例INSTANCE为singleton1
    private singleton1(){};//构造方法私有化，代表别人无法将这个对象new出来，如果想使用这个对象，那么可以 singleton1 s=singleton1.getInstance()
    public static singleton1 getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {
        singleton1 s1=singleton1.getInstance();
        singleton1 s2=singleton1.getInstance();
        System.out.println(s1==s2);
    }
}

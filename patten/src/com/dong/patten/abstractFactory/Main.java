package com.dong.patten.abstractFactory;

/**
 * @author 雪浪风尘
 * @Remember Keep thinking
 * 任何可以产生对象的方法或类，都可以称之为工厂
 * 单例也是一种工厂
 * 用接口而不是用抽象类：
 * 形容词用接口，名词用抽象类
 */
public class Main {
    public static void main(String[] args) {
//        Car c=new Car();
//        c.go();
//        AK47 w=new AK47();
//        w.shoot();
//        Bread b=new Bread();
//        b.printName();
        AbstractFactory f=new ModernFactory();
        Vehicle c=f.createVehicle();
        c.go();
        Weapon w=f.createWeapon();
        w.shoot();

    }
}

package com.dong.patten.factory;

/**
 * @author 雪浪风尘
 * @Remember Keep thinking
 * 任何可以产生对象的方法或类，都可以称之为工厂
 * 单例也是一种工厂
 * 任意定制交通工具：继承Moveable
 * 任意定制生产过程：XXXFactory.create()
 */
public class Main {
    public static void main(String[] args) {
       /* simpleVehicleFactory simpleVehicleFactory=new simpleVehicleFactory();
        Moveable car = simpleVehicleFactory.creatCar();
        car.go();
        Moveable m=simpleVehicleFactory.creatPlane();
        m.go();*/
       VehicleFactory factor=new CarFactory();
        Moveable moveable = factor.everyVehicle();
        moveable.go();
    }
}

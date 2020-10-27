package com.dong.patten.factory;

/**
 * @author 雪浪风尘
 * @Remember Keep thinking
 * 扩展性差
 */
public class simpleVehicleFactory {
    public Car creatCar(){
        return new Car();
    }
    public Plane creatPlane(){
        return new Plane();
    }
}

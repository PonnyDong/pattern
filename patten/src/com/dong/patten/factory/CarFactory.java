package com.dong.patten.factory;

/**
 * @author 雪浪风尘
 * @Remember Keep thinking
 */
public class CarFactory implements VehicleFactory {
    @Override
    public Moveable everyVehicle() {
        return new Car();
    }
}

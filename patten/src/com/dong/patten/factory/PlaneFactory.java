package com.dong.patten.factory;

/**
 * @author 雪浪风尘
 * @Remember Keep thinking
 */
public class PlaneFactory implements VehicleFactory {
    @Override
    public Moveable everyVehicle() {
        return new Plane();
    }
}

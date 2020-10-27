package com.dong.patten.abstractFactory;

/**
 * @author 雪浪风尘
 * @Remember Keep thinking
 */
public class ModernFactory extends AbstractFactory {

    @Override
    Vehicle createVehicle() {
        return new Car();
    }

    @Override
    Weapon createWeapon() {
        return new AK47();
    }
}

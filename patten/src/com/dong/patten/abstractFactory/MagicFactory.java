package com.dong.patten.abstractFactory;

/**
 * @author 雪浪风尘
 * @Remember Keep thinking
 */
public class MagicFactory extends AbstractFactory {

    @Override
    Vehicle createVehicle() {
        return new Broom();
    }

    @Override
    Weapon createWeapon() {
        return new MagicStick();
    }
}

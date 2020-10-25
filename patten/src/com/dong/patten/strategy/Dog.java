package com.dong.patten.strategy;

/**
 * @author 雪浪风尘
 * @Remember Keep thinking
 */
public class Dog  {
    int food;

    public Dog(int food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "food=" + food +
                '}';
    }
}

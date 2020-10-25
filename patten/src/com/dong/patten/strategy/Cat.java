package com.dong.patten.strategy;

/**
 * @author 雪浪风尘
 * @Remember Keep thinking
 */
public class Cat{
    int height,weight;

    public Cat(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }
}

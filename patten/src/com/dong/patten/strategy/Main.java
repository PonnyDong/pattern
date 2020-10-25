package com.dong.patten.strategy;

import java.util.Arrays;

/**
 * @author 雪浪风尘
 * @Remember Keep thinking
 * 策略模式封装的是做一件事情的不同的执行方式
 */
public class Main {
    public static void main(String[] args) {
        Cat[] a={new Cat(3,3),new Cat(5,5),new Cat(1,1)};
//        Dog[] a={new Dog(3),new Dog(5),new Dog(1)};
        Sorter<Cat> sorter=new Sorter();
        sorter.sort(a,new CatWeightComparator());
        System.out.println(Arrays.toString(a));
    }
}

package com.dong.patten.Observer;

/**
 * @author 雪浪风尘
 * @Remember Keep thinking
 */
public class test {
    public static void main(String[] args) {
        //创建一个主题
        ConcreteSubject concreteSubject=new ConcreteSubject();
        //定义一个观察者:用户
        ConcreteObserver concreteObserver=new ConcreteObserver("雪浪风尘");
        //观察
        concreteSubject.addObserver(concreteObserver);

        concreteSubject.notifyObserver("您关注的主播aabb开播了");
    }
}

package com.dong.patten.Observer;

/**
 * @author 雪浪风尘
 * @Remember Keep thinking
 */
public class ConcreteObserver implements Observer {
    //用户名
    private String name;
    public ConcreteObserver(String name){
        this.name=name;
    }

    @Override
    public void update(String message) {
        System.out.println(name+""+message);
    }
}

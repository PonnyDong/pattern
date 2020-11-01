package com.dong.patten.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 雪浪风尘
 * @Remember Keep thinking
 */
public class ConcreteSubject implements Subject {
    //定义一个数组，用来存储用户
    private List<Observer> userList=new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        userList.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        userList.remove(observer);
    }

    @Override
    public void notifyObserver(String message) {
        for (Observer observer:userList){
            observer.update(message);
        }
    }
}

package com.dong.patten.Observer;



/**
 * @author 雪浪风尘
 * @Remember Keep thinking
 * 抽象主题
 */
public interface Subject {
    //增加观察者
    public void addObserver(Observer observer);

    //删除观察者
    public void deleteObserver(Observer observer);

    //通知所有的观察者
    public void notifyObserver(String message);
}

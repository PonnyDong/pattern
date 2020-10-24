package com.dong.patten.singleton;

/**
 * @author 雪浪风尘
 * @Remember Keep thinking
 * 静态内部类
 */
public class singleton6 {
    private singleton6(){};
    private static class singleton6Holder{
        private final static singleton6 INSTANCE=new singleton6();
    }
    public static singleton6 getInstance(){
        return singleton6Holder.INSTANCE;
    }
}

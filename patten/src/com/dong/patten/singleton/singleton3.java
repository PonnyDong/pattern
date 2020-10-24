package com.dong.patten.singleton;

/**
 * @author 雪浪风尘
 * @Remember Keep thinking
 * 加synchronized锁实现线程安全，但是加锁会降低性能
 */
public class singleton3 {
    private static singleton3 INSTANCE;
    private singleton3(){};
    public static synchronized singleton3 getInstance(){
        if (INSTANCE==null){
            try {
                Thread.sleep(10);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            INSTANCE=new singleton3();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i=0;i<100;i++){
            new Thread(()->{
                System.out.println(singleton3.getInstance().hashCode());
            }).start();
        }

    }
}

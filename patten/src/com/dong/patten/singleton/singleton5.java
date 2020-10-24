package com.dong.patten.singleton;

/**
 * @author 雪浪风尘
 * @Remember Keep thinking
 * 双检锁
 */
public class singleton5 {
    private static volatile singleton5 INSTANCE;
    private singleton5(){};
    public static singleton5 getInstance(){
        if (INSTANCE==null){//如果不判断的话，也可以，只不过每次都要进行加锁，消耗性能
            synchronized (singleton5.class){
                if (INSTANCE==null){
                    try {
                        Thread.sleep(10);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    INSTANCE=new singleton5();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i=0;i<100;i++){
            new Thread(()->{
                System.out.println(singleton5.getInstance().hashCode());
            }).start();
        }
    }
}

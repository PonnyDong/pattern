package com.dong.patten.singleton;

/**
 * @author 雪浪风尘
 * @Remember Keep thinking
 */
public class singleton4 {
    private static singleton4 INSTANCE;
    private singleton4(){};
    public static singleton4 getInstance(){
        //不是线程安全，第一个线程进来判断为null，还没有拿到锁的时候，又进来
        //其它线程拿到了锁，实例化对象之后释放了锁，而之前的线程因为判断过为Null了，
        //所以会拿到所继续实例化对象，造成线程不安全
        if (INSTANCE==null){
            synchronized (singleton4.class){
                try {
                    Thread.sleep(10);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                INSTANCE=new singleton4();
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i=0;i<100;i++){
            new Thread(()->{
                System.out.println(singleton4.getInstance().hashCode());
            }).start();
        }
    }
}

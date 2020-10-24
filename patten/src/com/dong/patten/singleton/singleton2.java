package com.dong.patten.singleton;

/**
 * @author 雪浪风尘
 * @Remember Keep thinking
 * 懒汉式：lazy loading
 * 用的时候才进行初始化，但是存在线程不安全的问题
 */
public class singleton2 {
    private static singleton2 INSTANCE;
    private singleton2(){};
    public static singleton2 getInstance(){
        if (INSTANCE==null){//在多线程情况下，如果第一个线程判断INSTANCE为空，那么
            //就会去执行INSTANCE=new singleton2()，但是如果在实例化的过程中，另一个
            //线程也进来了，判断出INSTANCE为空，那么他也会去实例化singleton2，这样
            //的话，会实例化两个singleton2，生成两个singleton2，
            try {
                Thread.sleep(1);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            INSTANCE=new singleton2();
        }
        return INSTANCE;
    }
    public void m(){
        System.out.println("m");
    }

    public static void main(String[] args) {
        for (int i=0;i<100;i++){
            new Thread(()->{
                System.out.println(singleton2.getInstance().hashCode());
            }).start();
        }
    }
}

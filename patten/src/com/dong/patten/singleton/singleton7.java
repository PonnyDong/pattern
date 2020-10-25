package com.dong.patten.singleton;

/**
 * @author 雪浪风尘
 * @Remember Keep thinking
 * 不仅可以解决线程安全问题，还可以防止序列化
 * 不会被反序列化的原因：枚举类没有构造方法，因此即使拿到这个对象的class文件，也无法构造
 * 它的对象，它返回的只是一个值，
 */
public enum  singleton7 {

    INSTANCE;

    public void n(){
        //业务代码
    }

    public static void main(String[] args) {
        for (int i=0;i<100;i++){
            new Thread(()->{
                System.out.println(singleton7.INSTANCE.hashCode());
            }).start();
        }
    }
}

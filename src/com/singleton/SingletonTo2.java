package com.singleton;

public class SingletonTo2 {
    private static SingletonTo2 instance = null;

    //构造方法私有
    private SingletonTo2(){

    }

    //方法同步，防止不同线程产生多个实例
    synchronized  public static SingletonTo2 getInstance(){
        if(instance == null){
            instance = new SingletonTo2();
        }
        return instance;
    }
}

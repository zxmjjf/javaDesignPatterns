package com.singleton;

public class SingletonTo1 {
    int num = 0;
    String name = "no-name";
    private static SingletonTo1 instance = new SingletonTo1();
    private SingletonTo1(){

    }
    public static void main(String[] args){
        SingletonTo1 sing1 = getInstance();
        System.out.println(sing1.toString());
        sing1.setSingleton(2, "jjf");
        System.out.println(sing1.toString());

        SingletonTo1 sing2 = sing1.createMore();
        System.out.println(sing2.toString());

        SingletonTo1 sing3 = getInstance();
        System.out.println(sing3.toString());


    }
    public static SingletonTo1 getInstance(){
        return instance;
    }
    public  String toString(){
        return "In this Singleton : \nnum = " + num + "\nname = " + name;
    }
    public void setSingleton(int num, String name){
        this.num = num;
        this.name = name;
    }
    public SingletonTo1 createMore(){
        SingletonTo1 singletonTo1 = new SingletonTo1();
        return  singletonTo1;
    }


}

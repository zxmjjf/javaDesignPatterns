package com.factoryMethod;

public class Apple implements Fruit {
    private int treeAge;
    public int getTreeAge(){
        return treeAge;
    }
    public void setTreeAge(int treeAge){
        this.treeAge = treeAge;
    }
    public void grow(){
        System.out.println("苹果正在生长。。。。");
    }
    public void harvest(){
        System.out.println("开始收获苹果。。。。。");
    }
    public void plant(){
        System.out.println("开始栽种苹果。。。。");
    }


}

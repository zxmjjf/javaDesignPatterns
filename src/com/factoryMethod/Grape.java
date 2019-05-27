package com.factoryMethod;

public class Grape implements Fruit {
    private boolean seedless;

    public boolean isSeedless() {
        return seedless;
    }

    public void setSeedless(boolean seedless) {
        this.seedless = seedless;
    }
    public void grow(){
        System.out.println("葡萄正在生长。。。。");
    }
    public void harvest(){
        System.out.println("葡萄开始收获苹果。。。。。");
    }
    public void plant(){
        System.out.println("开始栽种葡萄。。。。");
    }
}

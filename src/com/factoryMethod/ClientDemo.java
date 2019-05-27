package com.factoryMethod;

public class ClientDemo {
    public static void main(String[] args) {
        //苹果园丁工厂
        FruitGardener fruitGardener = new AppleGardener();
        //通过工厂生产苹果
        Fruit apple = fruitGardener.factory();
        apple.plant();
        apple.grow();
        apple.harvest();

        System.out.println();

        //葡萄园丁工厂
        FruitGardener fruitGardener1 = new GrapeGargener();
        Fruit grape = fruitGardener1.factory();
        grape.plant();
        grape.grow();
        grape.harvest();
    }
}

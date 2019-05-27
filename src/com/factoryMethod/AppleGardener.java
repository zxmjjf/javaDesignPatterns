package com.factoryMethod;

public class AppleGardener implements FruitGardener {
    public Fruit factory(){
        return new Apple();
    }
}

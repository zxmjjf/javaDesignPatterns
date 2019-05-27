package com.factoryMethod;

public class GrapeGargener implements FruitGardener {
    public Fruit factory(){
        return new Grape();
    }
}

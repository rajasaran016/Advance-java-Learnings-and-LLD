package com.example.demo.LowLevelDesignPatterns.FactoryDesignPatterns.PracticalFactoryExample.Button;

public class IosButton implements IButton {

    @Override
    public void changeSize() {
        System.out.println("change IOS Button size");
    }

    @Override
    public void changeColor() {
        System.out.println("change IOS Button color");
    }
}

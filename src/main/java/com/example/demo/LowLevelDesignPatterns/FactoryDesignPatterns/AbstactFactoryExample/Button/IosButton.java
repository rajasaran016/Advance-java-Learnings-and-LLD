package com.example.demo.LowLevelDesignPatterns.FactoryDesignPatterns.AbstactFactoryExample.Button;

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

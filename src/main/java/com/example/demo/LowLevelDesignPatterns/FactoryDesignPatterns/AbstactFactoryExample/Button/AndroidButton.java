package com.example.demo.LowLevelDesignPatterns.FactoryDesignPatterns.AbstactFactoryExample.Button;

public class AndroidButton implements IButton {

    @Override
    public void changeSize() {
        System.out.println("change Android Button size");
    }

    @Override
    public void changeColor() {
        System.out.println("change Android Button color");
    }
}

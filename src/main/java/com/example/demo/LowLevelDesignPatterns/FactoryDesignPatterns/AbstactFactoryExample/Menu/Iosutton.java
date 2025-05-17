package com.example.demo.LowLevelDesignPatterns.FactoryDesignPatterns.AbstactFactoryExample.Menu;

import com.example.demo.LowLevelDesignPatterns.FactoryDesignPatterns.AbstactFactoryExample.Button.IButton;

public class Iosutton implements IMenu {

    @Override
    public void createMenu() {
        System.out.println("create IOS Menu");
    }

}

package com.example.demo.LowLevelDesignPatterns.FactoryDesignPatterns.AbstactFactoryExample.Menu;

public class AndoridMenu implements IMenu{

    @Override
    public void createMenu() {
        System.out.println("create Android Menu");
    }
}

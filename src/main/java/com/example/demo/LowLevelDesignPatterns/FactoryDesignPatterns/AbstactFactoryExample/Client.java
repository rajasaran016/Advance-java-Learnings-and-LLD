package com.example.demo.LowLevelDesignPatterns.FactoryDesignPatterns.AbstactFactoryExample;

public class Client {
    public static void main(String[] args) {

        Flutter flutter = new Flutter();
        UIFactory uiFactory = flutter.createUIFactory("Android");
        uiFactory.createButton().changeColor();
        uiFactory.createMenu().createMenu();
    }
}

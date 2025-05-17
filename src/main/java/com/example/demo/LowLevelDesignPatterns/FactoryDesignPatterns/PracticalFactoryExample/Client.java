package com.example.demo.LowLevelDesignPatterns.FactoryDesignPatterns.PracticalFactoryExample;

public class Client {
    public static void main(String[] args) throws Exception {

        Flutter flutter = new Flutter();
        UIFactory uiFactory = UIFactoryFactory.createUIFactory(SupportedPlatforms.Android);
        uiFactory.createButton().changeColor();
        uiFactory.createMenu().createMenu();
    }
}

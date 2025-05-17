package com.example.demo.LowLevelDesignPatterns.FactoryDesignPatterns.PracticalFactoryExample;

public class UIFactoryFactory {

    public static UIFactory createUIFactory(SupportedPlatforms platform) throws Exception{

        switch (platform) {
            case Android:
                return new AndroidUIFactory();
            case IOS:
                return new IOSUIFactory();
            default:
                throw new Exception("Platform is not support");
        }
    }
}

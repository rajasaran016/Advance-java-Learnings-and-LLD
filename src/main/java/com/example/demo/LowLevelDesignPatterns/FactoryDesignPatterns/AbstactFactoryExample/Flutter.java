package com.example.demo.LowLevelDesignPatterns.FactoryDesignPatterns.AbstactFactoryExample;

import java.util.Objects;

/*
    * Flutter is a cross-platform mobile framework for developing native Android and iOS apps.
    */
public class Flutter {

    public void SetRefreshRate(){
        System.out.println("Flutter refresh rate is 60 fps");
    }

    public void setTheme(){
        System.out.println("Flutter resolution is 1080p");
    }

    public UIFactory createUIFactory(String platform) {

        if(Objects.equals(platform, "IOS")) return new IOSUIFactory();
        else return new AndroidUIFactory();
    }
}

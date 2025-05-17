package com.example.demo.LowLevelDesignPatterns.FactoryDesignPatterns.AbstactFactoryExample;

import com.example.demo.LowLevelDesignPatterns.FactoryDesignPatterns.AbstactFactoryExample.Button.AndroidButton;
import com.example.demo.LowLevelDesignPatterns.FactoryDesignPatterns.AbstactFactoryExample.Button.IButton;
import com.example.demo.LowLevelDesignPatterns.FactoryDesignPatterns.AbstactFactoryExample.Button.IosButton;
import com.example.demo.LowLevelDesignPatterns.FactoryDesignPatterns.AbstactFactoryExample.Menu.AndoridMenu;
import com.example.demo.LowLevelDesignPatterns.FactoryDesignPatterns.AbstactFactoryExample.Menu.IMenu;
import com.example.demo.LowLevelDesignPatterns.FactoryDesignPatterns.AbstactFactoryExample.Menu.Iosutton;

public class IOSUIFactory implements UIFactory{

    @Override
    public IButton createButton() {
        System.out.println("create Android Button");
        return new IosButton();
    }

    @Override
    public IMenu createMenu() {
        System.out.println("create Android Menu");
        return new Iosutton();
    }

}

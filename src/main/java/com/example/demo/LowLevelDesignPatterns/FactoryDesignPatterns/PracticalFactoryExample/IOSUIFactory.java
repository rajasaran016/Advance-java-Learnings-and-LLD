package com.example.demo.LowLevelDesignPatterns.FactoryDesignPatterns.PracticalFactoryExample;

import com.example.demo.LowLevelDesignPatterns.FactoryDesignPatterns.PracticalFactoryExample.Button.IButton;
import com.example.demo.LowLevelDesignPatterns.FactoryDesignPatterns.PracticalFactoryExample.Button.IosButton;
import com.example.demo.LowLevelDesignPatterns.FactoryDesignPatterns.PracticalFactoryExample.Menu.IMenu;
import com.example.demo.LowLevelDesignPatterns.FactoryDesignPatterns.PracticalFactoryExample.Menu.Iosutton;

public class IOSUIFactory implements UIFactory {

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

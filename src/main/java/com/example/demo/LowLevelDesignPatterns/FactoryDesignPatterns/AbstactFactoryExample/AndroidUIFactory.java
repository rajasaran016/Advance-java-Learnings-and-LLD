package com.example.demo.LowLevelDesignPatterns.FactoryDesignPatterns.AbstactFactoryExample;

import com.example.demo.LowLevelDesignPatterns.FactoryDesignPatterns.AbstactFactoryExample.Button.AndroidButton;
import com.example.demo.LowLevelDesignPatterns.FactoryDesignPatterns.AbstactFactoryExample.Button.IButton;
import com.example.demo.LowLevelDesignPatterns.FactoryDesignPatterns.AbstactFactoryExample.Menu.AndoridMenu;
import com.example.demo.LowLevelDesignPatterns.FactoryDesignPatterns.AbstactFactoryExample.Menu.IMenu;

public class AndroidUIFactory implements UIFactory{
    @Override
    public IButton createButton() {
        System.out.println("create Android Button");
        return new AndroidButton();
    }

    @Override
    public IMenu createMenu() {
        System.out.println("create Android Menu");
        return new AndoridMenu();
    }
}

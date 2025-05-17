package com.example.demo.LowLevelDesignPatterns.FactoryDesignPatterns.PracticalFactoryExample;

import com.example.demo.LowLevelDesignPatterns.FactoryDesignPatterns.PracticalFactoryExample.Button.AndroidButton;
import com.example.demo.LowLevelDesignPatterns.FactoryDesignPatterns.PracticalFactoryExample.Button.IButton;
import com.example.demo.LowLevelDesignPatterns.FactoryDesignPatterns.PracticalFactoryExample.Menu.AndoridMenu;
import com.example.demo.LowLevelDesignPatterns.FactoryDesignPatterns.PracticalFactoryExample.Menu.IMenu;

public class AndroidUIFactory implements UIFactory {
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

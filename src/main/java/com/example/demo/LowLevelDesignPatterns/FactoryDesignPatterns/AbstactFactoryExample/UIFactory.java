package com.example.demo.LowLevelDesignPatterns.FactoryDesignPatterns.AbstactFactoryExample;

import com.example.demo.LowLevelDesignPatterns.FactoryDesignPatterns.AbstactFactoryExample.Button.IButton;
import com.example.demo.LowLevelDesignPatterns.FactoryDesignPatterns.AbstactFactoryExample.Menu.IMenu;

public interface UIFactory {

        IButton createButton();
        IMenu createMenu();
}

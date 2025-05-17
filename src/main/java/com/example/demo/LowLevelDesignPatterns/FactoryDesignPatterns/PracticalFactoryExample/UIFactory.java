package com.example.demo.LowLevelDesignPatterns.FactoryDesignPatterns.PracticalFactoryExample;

import com.example.demo.LowLevelDesignPatterns.FactoryDesignPatterns.PracticalFactoryExample.Button.IButton;
import com.example.demo.LowLevelDesignPatterns.FactoryDesignPatterns.PracticalFactoryExample.Menu.IMenu;

public interface UIFactory {

        IButton createButton();
        IMenu createMenu();
}

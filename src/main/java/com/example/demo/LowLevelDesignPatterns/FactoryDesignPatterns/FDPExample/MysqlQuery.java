package com.example.demo.LowLevelDesignPatterns.FactoryDesignPatterns.FDPExample;

public class MysqlQuery implements Query {
    @Override
    public void execute() {
        System.out.println("Mysql Query");
    }
}

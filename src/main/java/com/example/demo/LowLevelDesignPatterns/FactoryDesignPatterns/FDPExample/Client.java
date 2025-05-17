package com.example.demo.LowLevelDesignPatterns.FactoryDesignPatterns.FDPExample;

public class Client {

    public static void main(String[] args) {

        Service service = new Service(new MysqlDB());
        service.createUser();
    }
}

package com.example.demo.LowLevelDesignPatterns.FactoryDesignPatterns.FDPExample;


public class Service {

    Database db;
    public Service(Database db){
        this.db = db;
    }

    public void createUser(){
        Query q = db.createQuery();
        q.execute();
    }
}

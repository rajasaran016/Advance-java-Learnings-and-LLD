package com.example.demo.LowLevelDesignPatterns.SingletonDesignPattern.SingletonDP;

public class DBConnections {

    private static DBConnections instance = null;


    private DBConnections(){

    }

    public static DBConnections getInstance(){
        if(instance == null){
            instance = new DBConnections();
        }
        return instance;
    }

}

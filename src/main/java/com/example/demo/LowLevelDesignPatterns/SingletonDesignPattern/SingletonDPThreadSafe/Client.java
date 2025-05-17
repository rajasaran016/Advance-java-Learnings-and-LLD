package com.example.demo.LowLevelDesignPatterns.SingletonDesignPattern.SingletonDPThreadSafe;

import com.example.demo.LowLevelDesignPatterns.SingletonDesignPattern.SingletonDP.DBConnections;

public class Client {

    public static void main(String[] args) {
        DBConnections db1 = DBConnections.getInstance();
        DBConnections db2 = DBConnections.getInstance();
        System.out.println(db1 == db2);
    }
}

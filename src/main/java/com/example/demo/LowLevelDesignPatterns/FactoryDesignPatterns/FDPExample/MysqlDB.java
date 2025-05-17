package com.example.demo.LowLevelDesignPatterns.FactoryDesignPatterns.FDPExample;

public class MysqlDB implements Database {


    @Override
    public Query createQuery() {
        return new MysqlQuery();
    }

    @Override
    public Transaction creteTransaction() {
        return null;
    }

    @Override
    public String getVersion() {
        return "";
    }

    @Override
    public boolean isConnected() {
        return false;
    }
}

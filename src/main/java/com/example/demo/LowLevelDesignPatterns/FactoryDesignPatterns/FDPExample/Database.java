package com.example.demo.LowLevelDesignPatterns.FactoryDesignPatterns.FDPExample;

public interface Database  {

    // some methods. where return type is interface
    Query createQuery();
    Transaction creteTransaction();

    // some common methods. where return type common
    String getVersion();
    boolean isConnected();

}

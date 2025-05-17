package com.example.demo.LowLevelDesignPatterns.SingletonDesignPattern.SingletonDPThreadSafe;

public class DBConnections {
    private static DBConnections instance = null;
    private DBConnections() {}

//1. Lazy Initialization (Not Thread-Safe):
//    The instance is created only when it is requested for the first time.
//    Not thread-safe – Multiple threads may create separate instances simultaneously.
//2. Thread-Safe Singleton (Synchronized Method):
//    Uses the synchronized keyword to prevent multiple threads from creating multiple instances.
//            Drawback: Synchronized method incurs a performance cost.
//3. Double-Checked Locking (Thread-Safe and Efficient):
//    Combines lazy initialization with synchronization.
//    Reduces the cost of synchronization by checking the instance twice.
//    Why volatile?
//
//
//    Ensures visibility of changes to the instance across threads and prevents partial instantiation.
//
//
//4. Bill Pugh Singleton (Inner Static Helper Class):
//    Lazy-loaded and thread-safe without synchronization.
//    Uses a static inner class to hold the singleton instance.
//    Why is it thread-safe?
//    The SingletonHelper class is loaded only when getInstance() is called, ensuring lazy initialization.
//5. Enum Singleton (Best Approach):
//    Simplest and most robust implementation.
//    Enum provides serialization safety and prevents reflection attacks.

    public static DBConnections getInstance() {
        if(instance == null) {
            synchronized(DBConnections.class) {
                if(instance == null) {
                    instance = new DBConnections();
                }
            }
        }
        return instance;
    }
}

package com.example.demo.AdvanceJavaConcepts.MultiThreading.ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 50; i++) {

            PrintHelloWorld printHelloWorld = new PrintHelloWorld(i);
            executor.execute(printHelloWorld);
        }
        executor.shutdown();
    }
}

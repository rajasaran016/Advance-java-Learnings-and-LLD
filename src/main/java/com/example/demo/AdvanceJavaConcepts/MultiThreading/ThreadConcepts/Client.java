package com.example.demo.AdvanceJavaConcepts.MultiThreading.ThreadConcepts;

public class Client {

    public static void main(String[] args) {

        for (int i = 0; i < 50; i++) {

            PrintHelloWorld printHelloWorld = new PrintHelloWorld(i);
            Thread thread = new Thread(printHelloWorld);
            thread.start();

//            System.out.println(Thread.currentThread().getName() + " id " + i);

        }
    }
}

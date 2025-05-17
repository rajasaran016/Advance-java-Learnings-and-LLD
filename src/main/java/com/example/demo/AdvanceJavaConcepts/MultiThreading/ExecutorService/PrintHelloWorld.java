package com.example.demo.AdvanceJavaConcepts.MultiThreading.ExecutorService;

public class PrintHelloWorld implements Runnable {

    private int id;

    public PrintHelloWorld(int id) {
        this.id = id;
    }
    @Override
    public void run() {
        System.out.println("id-> " + id + " " + Thread.currentThread().getName());
    }
}

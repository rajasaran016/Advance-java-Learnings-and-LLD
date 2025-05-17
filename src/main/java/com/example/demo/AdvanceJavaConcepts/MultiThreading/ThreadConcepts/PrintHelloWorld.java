package com.example.demo.AdvanceJavaConcepts.MultiThreading.ThreadConcepts;

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

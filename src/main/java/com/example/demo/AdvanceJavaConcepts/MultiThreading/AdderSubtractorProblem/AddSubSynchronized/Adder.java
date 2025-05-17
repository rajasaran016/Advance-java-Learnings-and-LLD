package com.example.demo.AdvanceJavaConcepts.MultiThreading.AdderSubtractorProblem.AddSubSynchronized;

public class Adder implements Runnable {
    private Count count;

    public Adder(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        synchronized (count) {
            for (int i = 0; i <= 100000; i++) {
                this.count.value += 1;
            }
        }
    }
}

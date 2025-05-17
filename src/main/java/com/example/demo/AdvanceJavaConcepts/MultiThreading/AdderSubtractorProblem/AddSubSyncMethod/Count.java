package com.example.demo.AdvanceJavaConcepts.MultiThreading.AdderSubtractorProblem.AddSubSyncMethod;

public class Count {
    private int value = 0;

    public int getValue() {
        return value;
    }

    public synchronized void increment(int offer) {
        this.value += offer;
    }
}

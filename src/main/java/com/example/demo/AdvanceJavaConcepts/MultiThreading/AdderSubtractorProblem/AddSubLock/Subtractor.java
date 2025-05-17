package com.example.demo.AdvanceJavaConcepts.MultiThreading.AdderSubtractorProblem.AddSubLock;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable{

    private Count count;
    private Lock lock;

    public Subtractor(Count count, Lock lock) {
        this.count = count;
        this.lock = lock;
    }

    @Override
    public void run() {
        lock.lock();
        for(int i = 0; i <= 100000; i++) {
            count.value -= 1;
        }
        lock.unlock();
    }
}

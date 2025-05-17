package com.example.demo.AdvanceJavaConcepts.MultiThreading.ProcuderConsumerProblem.ProducerConsumerThread;

import java.util.Queue;

public class ProducerTask implements Runnable{

    private Queue<Object> queue;
    private int maxSize;
    private String taskName;

    public ProducerTask(Queue<Object> queue, int maxSize, String taskName) {
        this.queue = queue;
        this.maxSize = maxSize;
        this.taskName = taskName;
    }


    @Override
    public void run() {
        while(true){
            if(queue.size()<=maxSize){
            queue.add(new Object());
            System.out.println(("Adding shirt from queue: with producer " + taskName + " and size: " + queue.size()));
            }
        }
    }
}

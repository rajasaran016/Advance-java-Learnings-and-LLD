package com.example.demo.AdvanceJavaConcepts.MultiThreading.ProcuderConsumerProblem.ProducerConsumerThread;

import java.util.Queue;

public class ConsumerTask implements Runnable{

    private Queue<Object> queue;
    private int maxSize;
    private String taskName;

    public ConsumerTask(Queue<Object> queue, int maxSize, String taskName) {
        this.queue = queue;
        this.maxSize = maxSize;
        this.taskName = taskName;
    }


    @Override
    public void run() {
        while(true){
            if(queue.size() >= 0){
                queue.remove();
                System.out.println(("Removing shirt from queue: with consumer " + taskName + " and size: " + queue.size()));
            }
        }
    }
}

package com.example.demo.AdvanceJavaConcepts.MultiThreading.ProcuderConsumerProblem.ProducerConsumerSemaphores;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class ConsumerTask implements Runnable{

    private Queue<Object> queue;
    private int maxSize;
    private String taskName;
    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;

    public ConsumerTask(Queue<Object> queue, int maxSize, String taskName, Semaphore producerSemaphore, Semaphore consumerSemaphore) {
        this.queue = queue;
        this.maxSize = maxSize;
        this.taskName = taskName;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }


    @Override
    public void run() {
        while(true){
            try {
                consumerSemaphore.acquire();
                if (queue.size() >= 0) {
                    queue.remove();
                    System.out.println(("Removing shirt from queue: with consumer " + taskName + " and size: " + queue.size()));
                }
                producerSemaphore.release();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

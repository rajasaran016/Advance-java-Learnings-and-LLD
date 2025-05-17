package com.example.demo.AdvanceJavaConcepts.MultiThreading.ProcuderConsumerProblem.ProducerConsumerSemaphores;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class ProducerTask implements Runnable{

    private Queue<Object> queue;
    private int maxSize;
    private String taskName;
    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;

    public ProducerTask(Queue<Object> queue, int maxSize, String taskName, Semaphore producerSemaphore, Semaphore consumerSemaphore) {
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
                producerSemaphore.acquire();
                if(queue.size()<=maxSize){
                    queue.add(new Object());
                    System.out.println(("Adding shirt from queue: with producer " + taskName + " and size: " + queue.size()));
                }
                consumerSemaphore.release();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

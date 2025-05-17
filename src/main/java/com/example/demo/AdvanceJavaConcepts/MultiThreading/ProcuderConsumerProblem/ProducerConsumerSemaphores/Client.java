package com.example.demo.AdvanceJavaConcepts.MultiThreading.ProcuderConsumerProblem.ProducerConsumerSemaphores;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {

        Queue<Object> queue = new ConcurrentLinkedQueue<>();
        Semaphore producerSemaphore = new Semaphore(4);
        Semaphore consumerSemaphore = new Semaphore(0);

        ProducerTask p1 = new ProducerTask(queue, 6, "p1", producerSemaphore, consumerSemaphore);
        ProducerTask p2 = new ProducerTask(queue, 6, "p2", producerSemaphore, consumerSemaphore);
        ProducerTask p3 = new ProducerTask(queue, 6, "p3", producerSemaphore, consumerSemaphore);
        ProducerTask p4 = new ProducerTask(queue, 6, "p4", producerSemaphore, consumerSemaphore);
        ProducerTask p5 = new ProducerTask(queue, 6, "p5", producerSemaphore, consumerSemaphore);
        ProducerTask p6 = new ProducerTask(queue, 6, "p6", producerSemaphore, consumerSemaphore);

        ConsumerTask c1 = new ConsumerTask(queue, 6, "c1", producerSemaphore, consumerSemaphore);
        ConsumerTask c2 = new ConsumerTask(queue, 6, "c2", producerSemaphore, consumerSemaphore);
        ConsumerTask c3 = new ConsumerTask(queue, 6, "c3", producerSemaphore, consumerSemaphore);
        ConsumerTask c4 = new ConsumerTask(queue, 6, "c4", producerSemaphore, consumerSemaphore);
        ConsumerTask c5 = new ConsumerTask(queue, 6, "c5", producerSemaphore, consumerSemaphore);
        ConsumerTask c6 = new ConsumerTask(queue, 6, "c6", producerSemaphore, consumerSemaphore);

        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);
        Thread t3 = new Thread(p3);
        Thread t4 = new Thread(p4);
        Thread t5 = new Thread(p5);
        Thread t6 = new Thread(p6);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        Thread t7 = new Thread(c1);
        Thread t8 = new Thread(c2);
        Thread t9 = new Thread(c3);
        Thread t10 = new Thread(c4);
        Thread t11 = new Thread(c5);
        Thread t12 = new Thread(c6);
        t7.start();
        t8.start();
        t9.start();
        t10.start();
        t11.start();
        t12.start();


    }
}

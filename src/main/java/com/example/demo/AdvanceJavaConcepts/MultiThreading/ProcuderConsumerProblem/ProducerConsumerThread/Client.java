package com.example.demo.AdvanceJavaConcepts.MultiThreading.ProcuderConsumerProblem.ProducerConsumerThread;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Client {
    public static void main(String[] args) {

        Queue<Object> queue = new ConcurrentLinkedQueue<>();

        ProducerTask p1 = new ProducerTask(queue, 6, "p1");
        ProducerTask p2 = new ProducerTask(queue, 6, "p2");
        ProducerTask p3 = new ProducerTask(queue, 6, "p3");
        ProducerTask p4 = new ProducerTask(queue, 6, "p4");
        ProducerTask p5 = new ProducerTask(queue, 6, "p5");
        ProducerTask p6 = new ProducerTask(queue, 6, "p6");

        ConsumerTask c1 = new ConsumerTask(queue, 6, "c1");
        ConsumerTask c2 = new ConsumerTask(queue, 6, "c2");
        ConsumerTask c3 = new ConsumerTask(queue, 6, "c3");
        ConsumerTask c4 = new ConsumerTask(queue, 6, "c4");
        ConsumerTask c5 = new ConsumerTask(queue, 6, "c5");
        ConsumerTask c6 = new ConsumerTask(queue, 6, "c6");

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

package com.example.demo.AdvanceJavaConcepts.Lambdas.FunctionalInterface;

import java.util.function.Consumer;

public class Client {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        //way-1
        Tiger tiger = new TigerImpl();
        tiger.eat();

        //way-2
        //we declare a functional interface method on the fly
        Tiger tiger1 = new Tiger() {
            @Override
            public void eat() {
                System.out.println("Tiger is eating");
            }
        };
        tiger1.eat();

        //way-3
        //we declare a functional interface method on the fly
        Tiger tiger2 = () -> System.out.println("Tiger is eating");
        tiger2.eat();

        Consumer<Integer> consumer = (t) -> {
            System.out.println(x);
            System.out.println(y);
            System.out.println(t);
        };
        consumer.accept(10);

        Thread thread = new Thread(() -> System.out.println("Hello" + " " + Thread.currentThread().getName()));
        thread.start();
    }
}

package com.example.demo.AdvanceJavaConcepts.Generics.WithGenericMethod;

import static com.example.demo.AdvanceJavaConcepts.Generics.WithGenericMethod.Pair.doSomething;

public class Client {
    public static void main(String[] args) {

        Pair<Integer, String> p = new Pair<>(1, "saran");

        System.out.println(p.getA() + " " + p.getB());

        Pair<Integer, String> p2 = new Pair<>(2, "saran");
        System.out.println(p2.getA() + " " + p2.getB());

        doSomething(p2.getA());

        doSomething(p.getA(), p.getB());

    }
}

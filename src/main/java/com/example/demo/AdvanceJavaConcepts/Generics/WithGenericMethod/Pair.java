package com.example.demo.AdvanceJavaConcepts.Generics.WithGenericMethod;

public class Pair <A, B> {
    private A a;
    private B b;

    public Pair(A a, B b) {
        this.a = a;
        this.b = b;
    }

    public A getA() {
        return a;
    }
    public void setA(A a) {
        this.a = a;
    }
    public B getB() {
        return b;
    }
    public void setB(B b) {
        this.b = b;
    }
    public static <A> void doSomething(A a) {
        System.out.println(a);
    }

    public static <A, B> void doSomething(A a, B b) {
        System.out.println(a + " " + b);
    }
}

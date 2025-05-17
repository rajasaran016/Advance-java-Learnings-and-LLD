package com.example.demo.AdvanceJavaConcepts.OopsConcept;

public class B extends A {
    String userName;

    public B(){
        System.out.println("B constructor");
    }

    public B(int id) {
        super(id);
    }

    public void sayHello() {
        System.out.println("Hello " + "B");
    }

    public void sayHelloB() {
        System.out.println("Hello " + "B");
    }
}

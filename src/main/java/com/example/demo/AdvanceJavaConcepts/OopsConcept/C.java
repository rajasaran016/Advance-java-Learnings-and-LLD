package com.example.demo.AdvanceJavaConcepts.OopsConcept;

public class C extends B{
    float psp;

    public C(int id) {
        super(id);
    }

    public C(){
        super();
        System.out.println("C constructor");
    }

    public void sayHello(){
        System.out.println("Hello World" + "C");
    }
}

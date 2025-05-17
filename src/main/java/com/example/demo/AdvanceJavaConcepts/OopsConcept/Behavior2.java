package com.example.demo.AdvanceJavaConcepts.OopsConcept;

import org.springframework.stereotype.Component;

@Component
public class Behavior2 implements ExtendsInterface{

    public void eating(){
        System.out.println("eating 2");
    }


    public void sleep() {
        System.out.println("sleep 2 ");
    }


    public void walk() {
        System.out.println("walk 2 ");
    }

    public void walking() {
        System.out.println("walking 2 ");
    }

    public void falling() {
        System.out.println("falling 2");
    }

    public void sitting() {
        System.out.println("sitting 2");
    }


}

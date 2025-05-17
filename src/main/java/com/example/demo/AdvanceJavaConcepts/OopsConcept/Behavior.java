package com.example.demo.AdvanceJavaConcepts.OopsConcept;

import org.springframework.stereotype.Component;

@Component
public class Behavior implements BehaviorInterface {

    public void eating(){
        System.out.println("eating");
    }

    public void walking() {
        System.out.println("walking");
    }

    public void falling() {
        System.out.println("falling");
    }

    public void sitting() {
        System.out.println("sitting");
    }

    public void sleep(){
        System.out.println("sleep");
    }

    public void walk(){
        System.out.println("walk");
    }
}

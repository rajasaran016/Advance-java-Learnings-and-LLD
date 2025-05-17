package com.example.demo.AdvanceJavaConcepts.OopsConcept;

import org.springframework.stereotype.Component;

@Component
public class ImplementBehavior {

    private ExtendsInterface extendsInterface;

    public ImplementBehavior(ExtendsInterface extendsInterface) {
        this.extendsInterface = extendsInterface;
    }

    public void getBehaviorInterface() {
        extendsInterface.falling();
    }
}

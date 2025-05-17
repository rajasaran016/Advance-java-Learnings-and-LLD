package com.example.demo;

import com.example.demo.AdvanceJavaConcepts.OopsConcept.ImplementBehavior;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    private static ImplementBehavior implementBehavior;

    public DemoApplication(ImplementBehavior implementBehavior) {
        this.implementBehavior = implementBehavior;
    }

    public static void main(String[] args) {
//        SpringApplication.run(DemoApplication.class, args);
//
//        C x = new C();
//
//        x.sayHelloB();

    }

    final void sayHello() {
        System.out.println("Hello World!");
    }
    public static void getImplementBehavior() {
        implementBehavior.getBehaviorInterface();
    }

}

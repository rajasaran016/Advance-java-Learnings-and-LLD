package com.example.demo.AdvanceJavaConcepts.Generics.GenericsInheritance;

import java.util.List;

public class Dogs extends Animals {

    public void doSomethingDog(List<? super Dogs> list) {}
}

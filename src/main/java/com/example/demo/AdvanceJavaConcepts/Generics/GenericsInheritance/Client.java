package com.example.demo.AdvanceJavaConcepts.Generics.GenericsInheritance;

import java.util.*;

public class Client {

    public static void main(String[] args) {

        List<Animals> animals = new ArrayList<>();
        List<Cats> cats = new ArrayList<>();
        List<Dogs> dogs = new ArrayList<>();

        Animals animal = new Animals();
        Cats cat = new Cats();
        Dogs dog = new Dogs();

        animal.doSomethingAnimals(animals);
        dog.doSomethingDog(dogs);
        cat.doSomethingCats(cats);
        animal.doSomethingAnimals(dogs);
        dog.doSomethingDog(animals);


    }
}

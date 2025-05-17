package com.example.demo.AdvanceJavaConcepts.Lambdas.Streams;

public class Student {
    public String name;
    public int age;
    public int rollNumber;

    public Student(String name, int age, int rollNumber) {

        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", rollNumber=" + rollNumber + "]";
    }

    public int getAge() {
        return age;
    }
}

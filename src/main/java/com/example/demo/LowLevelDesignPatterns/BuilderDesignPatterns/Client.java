package com.example.demo.LowLevelDesignPatterns.BuilderDesignPatterns;

public class Client {
    public static void main(String[] args) {

        Student st = Student.builder().setAge(20).setName("Saran").build();

        System.out.println(st.getName() + " " + st.getAge());
    }
}

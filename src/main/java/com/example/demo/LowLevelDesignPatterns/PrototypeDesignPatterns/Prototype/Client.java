package com.example.demo.LowLevelDesignPatterns.PrototypeDesignPatterns.Prototype;

public class Client {

    public static void main(String[] args) {

        Student st = new Student();
        st.setName("Saran");
        st.setAge(20);

        IntelligentStudent is = new IntelligentStudent();
        is.setName("Venkata Sai");
        is.setAge(25);
        is.setCourse("Java");


        Student st1 = st.clone();
        Student st2 = is.clone();

        System.out.println(st1.getName() + " " + st1.getAge());
        System.out.println(st2.getName() + " " + ((IntelligentStudent) st2).getCourse());
    }
}

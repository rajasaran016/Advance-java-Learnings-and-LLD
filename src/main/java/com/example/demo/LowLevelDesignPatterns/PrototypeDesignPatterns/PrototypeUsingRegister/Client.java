package com.example.demo.LowLevelDesignPatterns.PrototypeDesignPatterns.PrototypeUsingRegister;

public class Client {

    public static void main(String[] args) {

        Student st = Registery.initiateStudent();

        Student st1 = Registery.getStudentByKey(st.getName()).clone();
        st1.setName("Venkata Sai");

        System.out.println(st1.getName());
        System.out.println(st.getName());

        IntelligentStudent is = new IntelligentStudent();
        is.setName("Pookie");
        is.setAge(45);

        Registery.register("Pookie", is);

        Student is1 = Registery.getStudentByKey("Pookie");

    }
}

package com.example.demo.LowLevelDesignPatterns.PrototypeDesignPatterns.PrototypeUsingRegister;

import java.util.HashMap;

public class Registery {

    private static final HashMap<String,Student> register = new HashMap<>();

    public static void register(String key, Student st){
        if(register.containsKey(key)){
            register.put(key, st);
        }
    }

    public static Student getStudentByKey(String key){
        return register.get(key);
    }

    public static Student initiateStudent(){
        Student OriginalStudent = new Student();
        OriginalStudent.setName("Saran");
        OriginalStudent.setAge(20);
        register.put("Saran", OriginalStudent);
        return OriginalStudent;

    }

    public static Student initiationStudentByKey(String key){
        return register.get(key).clone();
    }

    public static void clear(){
        register.clear();
    }
}

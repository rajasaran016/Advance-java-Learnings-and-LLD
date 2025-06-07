package com.example.demo.LowLevelDesignPatterns.BuilderDesignPatterns;

import java.util.Queue;

public class Student {
    private String name;
    private int age;
    private String email;
    private int phone;
    private int rollNo;
    private String department;
    private String address;
    private String gender;

    public Student(StudentBuilder sb){
        this.name = sb.name;
        this.age = sb.age;
        this.email = sb.email;
        this.phone = sb.phone;
        this.rollNo = sb.rollNo;
        this.department = sb.department;
        this.address = sb.address;
    }

    public String setName(String name){
        return this.name = name;
    }

    public int setAge(int age){
        return this.age = age;
    }

    public String setEmail(String email){
        return this.email = email;
    }

    public int setPhone(int phone){
        return this.phone = phone;
    }

    public int setRollNo(int rollNo){
        return this.rollNo = rollNo;
    }

    public String setDepartment(String department){
        return this.department = department;
    }

    public String setAddress(String address){
        return this.address = address;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String getEmail(){
        return this.email;
    }

    public int getPhone(){
        return this.phone;
    }

    public int getRollNo(){
        return this.rollNo;
    }

    public String getDepartment(){
        return this.department;
    }

    public String getAddress(){
        return this.address;
    }

    public static StudentBuilder builder(){

        return new StudentBuilder();
    }

    static class StudentBuilder{
        private String name;
        private int age;
        private String email;
        private int phone;
        private int rollNo;
        private String department;
        private String address;

        public StudentBuilder setName(String name){
            this.name = name;
            return this;
        }

        public StudentBuilder setAge(int age){
            this.age = age;
            return this;
        }

        public StudentBuilder setEmail(String email){
            this.email = email;
            return this;
        }

        public StudentBuilder setPhone(int phone){
            this.phone = phone;
            return this;
        }


        public Student build(){
            if(this.name == null) throw new RuntimeException("Name is mandatory");
            else if(this.age < 18) throw new RuntimeException("Age should be greater than 18");
            return new Student(this);
        }

    }
}

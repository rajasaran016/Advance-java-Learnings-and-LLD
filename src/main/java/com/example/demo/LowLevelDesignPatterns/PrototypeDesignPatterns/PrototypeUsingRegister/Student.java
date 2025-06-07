package com.example.demo.LowLevelDesignPatterns.PrototypeDesignPatterns.PrototypeUsingRegister;

public class Student implements Prototype<Student>{
    private String name;
    private int age;
    private String email;
    private int phone;
    private int rollNo;
    private String department;
    private String address;
    private String gender;

    public Student(){}

    public Student(Student st){
        this.name = st.name;
        this.age = st.age;
        this.email = st.email;
        this.phone = st.phone;
        this.rollNo = st.rollNo;
        this.department = st.department;
        this.address = st.address;
    }

    @Override
    public Student clone(){
        return new Student(this);
    }

    public void setName(String name){this.name = name;}

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

}

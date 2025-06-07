package com.example.demo.LowLevelDesignPatterns.PrototypeDesignPatterns.PrototypeUsingRegister;

public class IntelligentStudent extends Student{

    private String course;
    private int year;
    private int grade;
    private String courseName;

    public IntelligentStudent() {}
    public IntelligentStudent(IntelligentStudent st) {
        super(st);
        this.course = st.course;
        this.year = st.year;
        this.grade = st.grade;
        this.courseName = st.courseName;
    }

    public IntelligentStudent clone() {
        return new IntelligentStudent(this);
    }

}

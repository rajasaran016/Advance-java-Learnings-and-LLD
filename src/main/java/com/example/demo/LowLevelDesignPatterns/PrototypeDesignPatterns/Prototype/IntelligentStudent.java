package com.example.demo.LowLevelDesignPatterns.PrototypeDesignPatterns.Prototype;

public class IntelligentStudent extends Student {

    private String course;
    private int year;
    private int grade;

    public IntelligentStudent() {}
    public IntelligentStudent(IntelligentStudent st) {
        super(st);
        this.course = st.course;
        this.year = st.year;
        this.grade = st.grade;
    }

    public IntelligentStudent clone() {
        return new IntelligentStudent(this);
    }

    public void setCourse(String course) {
        this.course = course;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getCourse(){
        return this.course;
    }

    public int getYear(){
        return this.year;
    }

    public int getGrade(){
        return this.grade;
    }
}

package com.example.demo.AdvanceJavaConcepts.Lambdas.LambdasExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(1);
        list.add(2);

        Collections.sort(list);
        System.out.println(list);

        List<Student> students = new ArrayList<>();
        students.add(new Student("Saran", 20, 1));
        students.add(new Student("Rajesh", 21, 2));
        students.add(new Student("Raju", 22, 3));
        students.add(new Student("Rajesh", 21, 4));
        students.add(new Student("Raju", 22, 5));

        // Way-1
//        Comparator<Student> comparator = new Comparator<Student>() {
//
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.name.compareTo(o2.name);
//            }
//        };

        // Way-2
        Comparator<Student> comparator = (o1, o2) -> o1.age - o2.age;
        Comparator<Student> nameComparator = (o1, o2) -> o1.name.compareTo(o2.name);

        Collections.sort(students, comparator);
        for(Student student : students) System.out.println(student.toString());

        System.out.println("---------------------------");

        Collections.sort(students, nameComparator);
        for(Student student : students) System.out.println(student.toString());
    }
}

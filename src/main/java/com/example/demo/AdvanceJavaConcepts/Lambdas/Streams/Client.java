package com.example.demo.AdvanceJavaConcepts.Lambdas.Streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Client {
    public static void main(String[] args) {

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

        System.out.println("---------------------------");

        //Iterate the default students list using Streams
        students.stream().forEach(System.out::println);

        System.out.println("---------------------------");

        //Iterate the desired sorted students list using Streams
        students.stream().forEach(student -> System.out.println(student.name));

        System.out.println("---------------------------");

        //
        students.stream().sorted(comparator).forEach(System.out::println);

    }
}

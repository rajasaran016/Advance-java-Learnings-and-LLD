package com.example.demo.AdvanceJavaConcepts.MultiThreading.MergeSort.BySingleThread;

import java.util.List;

public class Client {

    public static void main(String[] args) throws Exception {

        //create the list of unsorted integers
        List<Integer> list = List.of(7, 3, 2, 5, 6, 4, 1, 8, 9);

        //create task for mergeSort pass by list
        MergeSorter mergeSort = new MergeSorter(list);

        //Passing task to ExecutorService and get the sorted list
        List<Integer> sortedList = mergeSort.call();
        System.out.println(sortedList);
    }
}

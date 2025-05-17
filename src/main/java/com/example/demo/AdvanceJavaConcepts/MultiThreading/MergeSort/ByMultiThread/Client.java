package com.example.demo.AdvanceJavaConcepts.MultiThreading.MergeSort.ByMultiThread;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

    public static void main(String[] args) throws Exception {

        //create the list of unsorted integers
        List<Integer> list = List.of(7, 3, 2, 5, 6, 4, 1, 8, 9);

        //Create executor service
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        //create task for mergeSort pass by list
        MergeSorter mergeSort = new MergeSorter(list, executorService);

        //Passing task to ExecutorService and get the sorted list
        Future<List<Integer>> sortedList = executorService.submit(mergeSort);
        List<Integer> finalList = sortedList.get();
        System.out.println(finalList);

        executorService.shutdown();
    }
}

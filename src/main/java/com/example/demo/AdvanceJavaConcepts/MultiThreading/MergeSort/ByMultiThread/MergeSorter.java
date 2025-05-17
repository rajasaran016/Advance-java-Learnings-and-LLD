package com.example.demo.AdvanceJavaConcepts.MultiThreading.MergeSort.ByMultiThread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MergeSorter implements Callable<List<Integer>>{
    private List<Integer> arrayToSort;
    private ExecutorService executor;

    public MergeSorter(List<Integer> arrayToSort, ExecutorService executor) {
        this.arrayToSort = arrayToSort;
        this.executor = executor;
    }

    @Override
    public List<Integer> call() throws Exception {
        System.out.println("New Thread: " + arrayToSort + " Name: " + Thread.currentThread().getName());

        //Breaking condition
        if(arrayToSort.size() <= 1) return arrayToSort;

        // find the mid of array
        int mid = arrayToSort.size()/2;

        //create left and right Array
        List<Integer> left = arrayToSort.subList(0, mid);
        List<Integer> right = arrayToSort.subList(mid, arrayToSort.size());

        //recursive call left and right arrays
        MergeSorter leftMergeSorter = new MergeSorter(left, executor);
        MergeSorter rightMergeSorter = new MergeSorter(right, executor);

        //Then merge process sort
        List<Integer> sortedArray = new ArrayList<>();

        int i = 0;
        int j = 0;

        Future<List<Integer>> leftSortedArray = executor.submit(leftMergeSorter);
        Future<List<Integer>> rightSortedArray = executor.submit(rightMergeSorter);

        List<Integer> leftFinalSortedArray = leftSortedArray.get();
        List<Integer> rightFinalSortedArray = rightSortedArray.get();

        while (i < leftFinalSortedArray.size() && j < rightFinalSortedArray.size()) {
            if (leftFinalSortedArray.get(i) < rightFinalSortedArray.get(j)) {
                sortedArray.add(leftFinalSortedArray.get(i));
                i++;
            }else {
                sortedArray.add(rightFinalSortedArray.get(j));
                j++;
            }
        }

        while (i < leftFinalSortedArray.size()) {
            sortedArray.add(leftFinalSortedArray.get(i));
            i++;
        }

        while (j < rightFinalSortedArray.size()) {
            sortedArray.add(rightFinalSortedArray.get(j));
            j++;
        }

        return sortedArray;
    }

}

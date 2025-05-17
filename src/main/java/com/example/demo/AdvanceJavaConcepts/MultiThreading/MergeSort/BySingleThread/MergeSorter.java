package com.example.demo.AdvanceJavaConcepts.MultiThreading.MergeSort.BySingleThread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class MergeSorter implements Callable<List<Integer>>{
    private List<Integer> arrayToSort;

    public MergeSorter(List<Integer> arrayToSort) {
        this.arrayToSort = arrayToSort;
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
        MergeSorter leftMergeSorter = new MergeSorter(left);
        MergeSorter rightMergeSorter = new MergeSorter(right);

        //Then merge process sort
        List<Integer> sortedArray = new ArrayList<>();

        int i = 0;
        int j = 0;

        List<Integer> leftSortedArray = leftMergeSorter.call();
        List<Integer> rightSortedArray = rightMergeSorter.call();

        while (i < leftSortedArray.size() && j < rightSortedArray.size()) {
            if (leftSortedArray.get(i) < rightSortedArray.get(j)) {
                sortedArray.add(leftSortedArray.get(i));
                i++;
            }else {
                sortedArray.add(rightSortedArray.get(j));
                j++;
            }
        }

        while (i < leftSortedArray.size()) {
            sortedArray.add(leftSortedArray.get(i));
            i++;
        }

        while (j < rightSortedArray.size()) {
            sortedArray.add(rightSortedArray.get(j));
            j++;
        }

        return sortedArray;
    }

}

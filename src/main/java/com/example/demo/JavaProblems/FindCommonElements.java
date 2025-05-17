package com.example.demo.JavaProblems;

import java.util.ArrayList;
import java.util.Arrays;

public class FindCommonElements {

    public static void main(String[] args) {

        int[] A  = new int[]{1,18,3,4,11,6,14,8,9};
        int[] B = new int[]{1,10,3,4,5,6,16,8,9};
        int[] C = new int[]{1,10,3,4,5,6,18,8,9};

        ArrayList<Integer> ans = new ArrayList< >();

        Arrays.sort(A);
        Arrays.sort(B);
        Arrays.sort(C);

        int[] mergeArr = mergerSortedArray(A, B);
        mergeArr = mergerSortedArray(mergeArr, C);

        System.out.println(Arrays.toString(mergeArr));

        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));
        System.out.println(Arrays.toString(C));

        int N = A.length;
        int M = B.length;
        int L = C.length;

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < N && j < M && k < L) {

            if(A[i] == B[j] && A[i] == C[k]) {
                ans.add(A[i]);
                i++;
                j++;
                k++;
            }else if(A[i] < B[j] &&  A[i] < C[k]) {
                i++;
            }else if(B[j] < A[i] && B[j] < C[k]) {
                j++;
            }else if(C[k] < A[i] && C[k] < B[j]) {
                k++;
            }else if(B[j] == C[k]){
                j++;
                k++;
            }else if(A[i] == B[j]){
                i++;
                j++;
            }else if(A[i] == C[k]){
                i++;
                k++;
            }
        }

        System.out.println(ans);
    }

    private static int[] mergerSortedArray(int[] a, int[] b) {
        int N = a.length;
        int M = b.length;

        int[] ans = new int[N + M];

        int i = 0, j = 0;
        int k = 0;

        while(i < N && j < M) {
            if(a[i] < b[j]) {
                ans[k] = a[i];
                i++;
            }else{
                ans[k] = b[j];
                j++;
            }
            k++;
        }

        while(i < N) {
            ans[k] = a[i];
            i++;
            k++;
        }
        while(j < M) {
            ans[k] = b[j];
            j++;
            k++;
        }

        return ans;
    }
}

package com.example.demo.JavaProblems;

public class FirstMissingNumber {

    public static void main(String[] args) {

        int[] A = {1,6,10,9,5,8,7,4,2};
        boolean flag = false;

        int N = A.length;

        boolean[] B = new boolean[N];

        for(int i = 0; i < N; i++){
            if(A[i] < N) B[A[i]] = true;
        }

        for(int i = 1; i < N; i++){
            if(!B[i]) {
                System.out.print(i + " ");
                flag = true;
            }
        }

        if(!flag){
            System.out.println(N+1);
        }
    }
}

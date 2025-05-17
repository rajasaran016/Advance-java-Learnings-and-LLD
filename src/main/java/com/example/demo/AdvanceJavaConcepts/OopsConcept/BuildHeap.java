package com.example.demo.AdvanceJavaConcepts.OopsConcept;

public class BuildHeap {

    public static void main(String[] args) {

        int[] A  = new int[]{1,18,3,4,11,6,14,8,9};
        int[] B = new int[]{1,10,3,4,5,6,16,8,9};
        int[] C = new int[]{1,10,3,4,5,6,18,8,9};

        BuildHeap test = new BuildHeap();

        for(int i : A){
            System.out.print(i + " ");
        }

        test.buildHeap(A);

        System.out.println();

        for(int i : A){
            System.out.print(i + " ");
        }

    }

        public int[] buildHeap(int[] A) {
            // code here

            int N = A.length;
            int pi = N/2 - 1;

            for(int i = pi; i >=0; i--){
                downHeapify(A,i,N);
            }

            return A;

        }

        public void downHeapify(int[] A, int i, int N){
            int l;

            while(2*i+1 < N){

                if(N > 2*i+2) l =  A[2*i+2];
                else l = Integer.MAX_VALUE;

                int min = Math.min(Math.min(A[2*i+1], l), A[i]);

                if(min == A[i]) break;
                else if(min == A[2*i+1]){
                    swap(A, i, 2*i+1);
                    i = 2*i+1;
                }else{
                    swap(A, i, 2*i+2);
                    i = 2*i+2;
                }
            }
        }

        public void swap(int[] A, int i, int j){
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }
}

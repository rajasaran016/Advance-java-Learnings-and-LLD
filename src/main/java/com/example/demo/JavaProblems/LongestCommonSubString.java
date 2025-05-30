package com.example.demo.JavaProblems;

public class LongestCommonSubString {

    public static void main(String[] args) {

        String str1 = "HMHA";
        String str2 = "MMHB";

        int max = 0;

        for(int i = 0; i < str1.length(); i++){

            int k = i;

            for(int j = 0; j < str2.length(); j++){

                if(k < str1.length() && str1.charAt(k) == str2.charAt(j)){
                    k++;
                    max = Math.max(max, k-i);
                }else{
                    k=i;
                }
            }
        }

        System.out.println(max);
    }
}

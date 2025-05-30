package com.example.demo.JavaProblems;

import java.security.PublicKey;

public class k_Anagrams {

    public static void main(String[] args) {
        String s1 = "anagram";
        String s2 = "grammar";

        int k = 3;

        int[] ch = new int[26];

        for(int i = 0; i < s1.length(); i++){
            ch[s1.charAt(i) - 'a']++;
        }

        for(int i = 0; i < s2.length(); i++){
            ch[s2.charAt(i) - 'a']--;
        }

        int cnt = 0;

        for(int i : ch){
            if(i > 0) cnt++;
        }

        System.out.println(cnt <= k);

    }
}

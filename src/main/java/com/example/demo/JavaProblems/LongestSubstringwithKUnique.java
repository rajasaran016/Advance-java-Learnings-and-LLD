package com.example.demo.JavaProblems;

import java.util.HashMap;

public class LongestSubstringwithKUnique {

    public static void main(String[] args) {
        LongestSubstringwithKUnique obj = new LongestSubstringwithKUnique();
        System.out.println(obj.longestkSubstr("araaci", 2));
    }

    public int longestkSubstr(String s, int k) {
        // code here
        int N = s.length();
        HashMap<Character, Integer> freqMap = new HashMap<>();

        int j = 0;
        int ans = -1;

        for(int i = 0; i < N; i++){

            freqMap.put(s.charAt(i), freqMap.getOrDefault(s.charAt(i), 0) + 1);

            while(freqMap.size() > k){
                freqMap.put(s.charAt(j), freqMap.get(s.charAt(j))-1);
                if(freqMap.get(s.charAt(j)) == 0) freqMap.remove(s.charAt(j));
                j++;
            }

            if(freqMap.size() == k) ans = Math.max(ans, i-j+1);
        }

        return ans;
    }
}

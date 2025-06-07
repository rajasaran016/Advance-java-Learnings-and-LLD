package com.example.demo.JavaProblems;

import java.util.HashMap;

public class MinmumWindowSubstring {

    public static void main(String[] args) {
        MinmumWindowSubstring obj = new MinmumWindowSubstring();
        System.out.println(obj.minWindow("ADOBECODEBANC", "ABC"));
    }


    public String minWindow(String s, String t) {

        HashMap<Character, Integer> map = new HashMap<>();

        int n = s.length();
        int m = t.length();
        if(m > n) return "";
        int cnt = 0;
        int start = 0;
        int l = 0;
        int minLen = Integer.MAX_VALUE;

        for(char ch : t.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        for(int r = 0; r < n; r++){

            if(map.containsKey(s.charAt(r))){
                if(map.get(s.charAt(r)) == 1) cnt++;
                map.put(s.charAt(r), map.get(s.charAt(r))-1);
            }
            while(cnt == map.size()){

                if(r-l+1 < minLen){
                    minLen = r-l+1;
                    start = l;
                }
                if(map.containsKey(s.charAt(l))){
                    map.put(s.charAt(l), map.get(s.charAt(l))+1);
                    if(map.get(s.charAt(l)) == 1) cnt--;
                }
                l++;
            }
        }

        if(minLen == Integer.MAX_VALUE) return "";

        return s.substring(start, start+minLen);
    }
}

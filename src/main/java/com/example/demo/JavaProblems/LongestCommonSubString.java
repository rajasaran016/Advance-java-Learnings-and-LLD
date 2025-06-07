package com.example.demo.JavaProblems;

public class LongestCommonSubString {

    public static void main(String[] args) {

        String str1 = "Bengal";
        String str2 = "Bangalore";

        maxCommStr(str1, str2);

    }

    public static int maxCommStr(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        // Create a table to store lengths of longest
        // common suffixes of substrings. Note that LCSuf[i][j]
        // is going to contain length of longest common suffix
        // of s1[0..i-1] and s2[0..j-1].
        int[][] LCSuf = new int[m + 1][n + 1];
        int res = 0;

        // Following steps build LCSuf[m+1][n+1] in bottom up fashion.
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    LCSuf[i][j] = LCSuf[i - 1][j - 1] + 1;
                    res = Math.max(res, LCSuf[i][j]);
                } else {
                    LCSuf[i][j] = 0;
                }
            }
        }
        return res;
    }

    public  static void longestCommonSubstring2(String str1, String str2) {
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

package com.example.demo.JavaProblems;

public class countArrayPairsDivisiblebyK {

        public long countPairs(int[] nums, int k) {

            int N = nums.length;

            long[] freq = new long[k];

            for(int i = 0; i < N; i++){

                freq[nums[i]%k]++;

                System.out.print(freq[nums[i]%k] + i);
            }


            long ans = freq[0] * k-1;

            for(int i = 1; i <= k/2; i++){

                if(i == k-i) ans += (freq[i]*k-1)-1;
                else if(i*(k-i) == k) ans += (freq[i]*freq[k-i]);
            }

            if(ans < 0) return 0;

            return ans;
        }
    }

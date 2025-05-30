package com.example.demo.JavaProblems;

import java.util.*;

public class RearrangeStringkDistanceApart {

    public static void main(String[] args) {
        String s = "aabbcc";
        int k = 2;
        RearrangeStringkDistanceApart obj = new RearrangeStringkDistanceApart();
        String ans = obj.rearrangeString(s, k);
        System.out.println(ans);
    }

        public String rearrangeString(String s, int k) {
            if (k == 0) return s;

            // Step 1: Frequency map
            Map<Character, Integer> freqMap = new HashMap<>();
            for (char c : s.toCharArray()) {
                freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
            }

            // Step 2: Max-heap based on frequency
            PriorityQueue<Character> maxHeap = new PriorityQueue<>(
                    (a, b) -> freqMap.get(b) - freqMap.get(a)
            );
            maxHeap.addAll(freqMap.keySet());

            // Step 3: Queue to manage cooldown
            Queue<Pair> waitQueue = new LinkedList<>();
            StringBuilder result = new StringBuilder();

            while (!maxHeap.isEmpty()) {
                char current = maxHeap.poll();
                result.append(current);
                freqMap.put(current, freqMap.get(current) - 1);

                waitQueue.offer(new Pair(current, freqMap.get(current)));

                // Wait for k distance before reusing
                if (waitQueue.size() >= k) {
                    Pair front = waitQueue.poll();
                    if (front.freq > 0) {
                        maxHeap.offer(front.ch);
                    }
                }
            }

            return result.length() == s.length() ? result.toString() : "";
        }

        private static class Pair {
            char ch;
            int freq;

            Pair(char ch, int freq) {
                this.ch = ch;
                this.freq = freq;
            }
        }
}

package com.LeetCode;

import java.util.HashSet;

public class LC_128 {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int longest = 0;
        int  m = 0;
        for (int n:set){
            m=1;
            if(!set.contains(n-1)){
                while (set.contains(n+1)){
                      m++;
                      n++;
                }
                longest = Math.max(longest,m);
            }
        }
        return longest;
    }
}

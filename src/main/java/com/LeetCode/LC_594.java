package com.LeetCode;

import org.jcodings.util.Hash;

import java.util.HashMap;

public class LC_594 {
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int longest = 0;
        for ( int n :map.keySet()){
            if(map.containsKey(n+1)){
                longest = Math.max(longest,map.get(n)+map.get(n+1));
            }
        }
        return longest;
    }
}

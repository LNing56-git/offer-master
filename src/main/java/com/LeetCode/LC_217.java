package com.LeetCode;

import java.util.HashMap;
import java.util.HashSet;

public class LC_217 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        return set.size()<nums.length;
    }
}

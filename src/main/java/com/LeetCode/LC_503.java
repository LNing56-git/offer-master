package com.LeetCode;

/**
 * 下一个最大的元素
 */


public class LC_503 {

    public int[] nextGreaterElements(int[] nums) {
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            res[i]=-1;
        }
        for (int i = 0;i<nums.length;i++){
            for (int j=i+1;j<2*nums.length;j++){
                int temp = j;
                if (j>=nums.length){
                    temp = j-nums.length;
                }
                if (nums[temp]>nums[i]){
                    res[i] = nums[temp];
                }
            }
        }
        return res;
    }
}

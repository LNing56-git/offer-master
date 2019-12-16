package com.LeetCode;

public class LC_665 {
    public boolean checkPossibility(int[] nums) {
        int length = nums.length;
        if(length<=2)return true;
        int n=0;
        for(int i=1;i<length&&n<2;i++) {
            if(nums[i]>=nums[i-1]){
                continue;
            }
            if(i>1&&nums[i-2]==nums[i-1]){
                nums[i]=nums[i-1];
                n++;
            }else {
                nums[i-1]=nums[i];
                n++;
            }
        }
        return n<=1;
    }
    public static void main(String[] args) {
        int[]a = {4,2,1};
        System.out.println(new LC_665().checkPossibility(a));
    }
}

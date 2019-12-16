package com.LeetCode;

public class LC_53 {

    public int maxSubArray(int[] nums) {
        int length = nums.length;
        if(length==1){
                return nums[0];
        }
        int sum = nums[0];
        int maxSum = sum;
        for (int i=1;i<length;i++){
            if(sum<0&&nums[i]>sum){
                sum=nums[i];
            }else {
                sum+=nums[i];
            }
            maxSum = maxSum>sum?maxSum:sum;
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[]a = {-2,1,-3,4,-1,2,1,-5,4};
        int b = Integer.MIN_VALUE;
        System.out.println(new LC_53().maxSubArray(a));
    }
}

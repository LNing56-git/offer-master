package com.LeetCode;

public class LC_153 {
    public int findMin(int[] nums) {
        int L = 0;
        int R = nums.length-1;
        int mid = 0;
        while (L<R){
            mid = (R+L)>>1;
            if (nums[mid]<nums[R]){
                R = mid;
            }else {
                L = mid+1;
            }
        }
        return nums[L];
    }

    public static void main(String[] args) {
        int[] a = {3,4,5,1,2};
        System.out.println(new LC_153().findMin(a));
    }
}

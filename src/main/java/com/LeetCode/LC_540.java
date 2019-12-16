package com.LeetCode;

import java.util.Arrays;

public class LC_540 {
//    public int singleNonDuplicate(int[] nums) {
//        Arrays.sort(nums);
//        int length = nums.length;
//        int result=0 ;
//        for(int i=0;i<length;){
//            if(nums[i]==nums[i+1]){
//                    i+=2;
//            }else {
//                result= i;
//                break;
//            }
//        }
//        return result;
//    }
    public  int singleNonDuplicate(int[] nums){
        int L = 0;
        int R = nums.length-1;
        int mid=(L+R)>>1;
        while (L<R){
            if(mid%2==1){
                if(mid==R)return nums[mid];
                if(nums[mid]==nums[mid-1]){
                    L= mid+1;
                }else if(nums[mid]==nums[mid+1]){
                    R = mid-1;
                }else {
                    return nums[mid];
                }
            }else {
                if(mid==L)return nums[mid];
                if(nums[mid]==nums[mid+1]){
                    L = mid+1;
                }else if(nums[mid]==nums[mid-1]){
                    R= mid-1;
                }else {
                    return nums[mid];
                }
            }
            mid =(L+R)>>1;
        }
        return nums[mid];
    }
    public static void main(String[] args) {
        int[] a = {1,2,2,3,3};
        System.out.println(new LC_540().singleNonDuplicate(a));
    }
}

package com.LeetCode;

import java.util.Arrays;
import java.util.PriorityQueue;

public class LC_215 {
//    //调库函数，时间复杂度O(NlogN),空间复杂度O(1)
//    public int findKthLargest(int[] nums, int k) {
//        Arrays.sort(nums);
//        return nums[nums.length-k];
//    }

//    public int findKthLargest(int[] nums,int k){
//        PriorityQueue<Integer> queue = new PriorityQueue<>();
//        for(int val:nums){
//            queue.add(val);
//            if(queue.size()>k){
//                queue.poll();
//            }
//        }
//        return queue.peek();
//    }
public int findKthLargest(int[] nums,int k){
    int start=0;
    int end = nums.length-1;
    if(start==end){
        return nums[start];
    }
    int temp = nums.length-k;int a=-1;
    while (start<end){
        a = partition(start,end,nums);
        if(a==temp){
            break;
        }else if(a<temp){
            start =a+1;
        }else {
            end = a-1;
        }
    }
    if(start==end){
        return nums[start];
    }else{
        return nums[a];
    }

}
public int partition(int start,int end,int[]nums){

    int i = start,j = end;
    int index = nums[start];
    while (i<j){
        while (nums[j]>=index&&i<j)j--;
        if(i<j){
            nums[i++] = nums[j];
        }
        while (nums[i]<=index&&i<j)i++;
        if(i<j){
            nums[j--]=nums[i];
        }
    }
    nums[i]=index;
    return i;
}

    public static void main(String[] args) {
        int []a={2,1};
        LC_215 lc_215 = new LC_215();
        System.out.println(lc_215.findKthLargest(a,2));
    }
}

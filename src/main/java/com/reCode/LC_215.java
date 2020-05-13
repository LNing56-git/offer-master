package com.reCode;


import java.util.PriorityQueue;
import java.util.Queue;

public class LC_215 {
    //    public int findKthLargest(int[] nums, int k) {
//        Queue<Integer> priorityQueue = new PriorityQueue<>();
//        for (int num:nums){
//            priorityQueue.add(num);
//            if (priorityQueue.size()>k){
//                priorityQueue.remove();
//            }
//        }
//        return priorityQueue.peek();
//    }
    public int findKthLargest(int[] nums, int k) {
        int start = 0;
        int end = nums.length-1;
        if (start==end){
            return nums[start];
        }
        int a = -1;
        while (start<end){
            a = partition(start,end,nums);
            if (a==nums.length-k){
                break;
            }else if (a>nums.length-k){
                end = a-1;
            }else {
                start = a+1;
            }
        }
        if (start==end){
            return nums[start];
        }else {
            return nums[a];
        }
    }
    public int partition(int start,int end,int[] arry){
        int i =start,j=end;
        if (start<end){
            int index = arry[start];
            while (i<j){
                while (i<j&&arry[j]>=index){
                    j--;
                }
                if (i<j){
                    arry[i++]=arry[j];
                }
                while (i<j&&arry[i]<=index){
                    i++;
                }
                if (i<j){
                    arry[j--]=arry[i];
                }
            }
            arry[i] = index;
            return i;
        }else {
            return -1;
        }

    }
}
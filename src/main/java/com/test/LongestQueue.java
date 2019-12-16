package com.test;

import com.LeetCode.LC_215;

public class LongestQueue {
    public int find(int[] arr){
        int count = 1;
    ///    int c=0;
        int length = arr.length;
        int max = 1;
        for(int i=0;i<length;i++){
            int flag = arr[i];
            for(int j=i+1;j<length;j++){
                if(arr[j]>flag){
                    flag=arr[j];
                    count++;
              //      c=i;
                }else break;
            }
            if(count>max){
                max = count;
            }
            count = 1;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,6,3,2,1};
        System.out.println(new LongestQueue().find(a));
    }
}

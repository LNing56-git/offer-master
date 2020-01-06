package com.test;

public class quickSort {
    public static void quickS(int start,int end,int[] target){
        if(start<end){
        int l = start;
        int m = end;
        int index = target[l];
        while (l<m){
            while (l<m&&index<=target[m]){
                m--;
            }
            if(l<m){
                target[l++]=target[m];
            }
            while (l<m&&index>=target[l]){
                l++;
            }
            if(l<m){
                target[m--]=target[l];
            }
        }

        target[l]=index;
        quickS(start,l,target);
        quickS(l+1,end,target);
    }}

    public static void main(String[] args) {
        int[]a={1,2,4,2,1,67,3};
        quickS(0,6,a);
        for (int b:
             a) {
            System.out.println(b);
        }
    }
}

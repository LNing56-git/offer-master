package com.LeetCode;

public class LC_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int temp = 0;
        for(int i =m;i<m+n;i++){
            nums1[i]=nums2[temp++];
        }
        quickSort(0,m+n-1,nums1);
    }
    public  void quickSort(int start,int end,int[] target){
        if(start>=end){
            return;
        }
        int i = start,j = end ;
        int index = target[start];
        while (i<j){
            while (target[j]>=index&&i<j){
                j--;
            }
            if(i<j){
                target[i++]=target[j];
            }
            while (target[i]<=index&&i<j){
                i++;
            }
            if(i<j){
                target[j--]=target[i];
            }
        }
        target[i] = index  ;
        quickSort(start,i-1,target);
        quickSort(i+1,end,target);
    }
    public static void main(String[] args) {
        int p[] = {6,5,2,0,0,0,0,0};
        int a[] = {1,5,2,3};
        LC_88 lc_88 = new LC_88();
        lc_88.merge(p,3,a,4);
        for(int index:p){
            System.out.println(index);
        }

    }
}

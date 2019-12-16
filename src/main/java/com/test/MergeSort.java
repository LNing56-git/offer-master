package com.test;

public class MergeSort {
    public void mege(int[]arr,int low,int mid,int high,int[]temp){
        int i=0;
        int j=low,k=mid+1;
        while (j<=mid&&k<=high){
            if(arr[j]<arr[k]){
                temp[i++]=arr[j++];
            }else {
                temp[i++]=arr[k++];
            }
        }
        while (j<=mid){
            temp[i++]=arr[j++];
        }
        while (k<=high) {
            temp[i++]=arr[k++];
        }
        for(int a = 0;a<i;a++){
            arr[low+a]=temp[a];
        }
    }
    public void mergeSort(int[]arr,int low,int high,int[] temp){
        if(low<high){
            int mid = (low+high)/2;
            mergeSort(arr,low,mid,temp);
            mergeSort(arr,mid+1,high,temp);
            mege(arr,low,mid,high,temp);
        }
    }
    public static void main(String[] args) {
        int[] b = {1,3,1,5,7,2};
        MergeSort mergeSort = new MergeSort();
        int[] temp = new int[b.length];
        mergeSort.mergeSort(b,0,5,temp);
        for(int t:b){
            System.out.println(t);
        }
    }
}

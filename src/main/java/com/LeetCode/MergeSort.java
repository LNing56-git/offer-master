package com.LeetCode;

public class MergeSort {
    public int [] merge(int[] arr,int start,int end){
        if(start==end){
            return new int[]{arr[start]};
        }
        int mid = (start+end)/2;
        int []left = merge(arr,start,mid);
        int []right = merge(arr,mid+1,end);
        int [] he = new int[left.length+right.length];
        int lef=0,rig=0,h=0;
        while (lef<left.length&&rig<right.length){
            he[h++]= right[rig]<left[lef]?right[rig++]:left[lef++];
        }
        while (lef<left.length){
            he[h++]=left[lef++];
        }
        while (rig<right.length){
            he[h++]=right[rig++];
        }
        return he;
    }

    public static int[] mergeSort(int[] nums, int l, int h) {
        if (l == h)
            return new int[] { nums[l] };

        int mid = l + (h - l) / 2;
        int[] leftArr = mergeSort(nums, l, mid); //左有序数组
        int[] rightArr = mergeSort(nums, mid + 1, h); //右有序数组
        int[] newNum = new int[leftArr.length + rightArr.length]; //新有序数组

        int m = 0, i = 0, j = 0;
        while (i < leftArr.length && j < rightArr.length) {
            newNum[m++] = leftArr[i] < rightArr[j] ? leftArr[i++] : rightArr[j++];
        }
        while (i < leftArr.length)
            newNum[m++] = leftArr[i++];
        while (j < rightArr.length)
            newNum[m++] = rightArr[j++];
        return newNum;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,2,4,5,6,3,12,2,432,52};
        int[]a ;
        MergeSort mergeSort = new MergeSort();
        a = mergeSort.merge(arr,0,arr.length-1);
        for (int b:a){
            System.out.print(b+" ");
        }
    }
}

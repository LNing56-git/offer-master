package com.ln.question30;

public class question30 {
    public int partion(int[]arr ,int start ,int end){
        int i=start,j=end,index=arr[start];
        while(i<j){
            while (arr[j]>=index&&i<j){
                j--;
            }
            if(i<j){
                arr[i++]=arr[j];
            }
            while (arr[i]<=index&&i<j){
                i++;
            }
            if(i<j){
                arr[j--]=arr[i];
            }
        }
        return i;
    }
    public void find(int index,int []arr){
        int temp = partion(arr,0,arr.length-1);
        while (temp!=index-1){
            if(temp<index-1){
                temp = partion(arr,temp,arr.length-1);
            }
            if(temp>index-1) {
                temp = partion(arr,0,temp);
            }
        }
        for(int i=0;i<index;i++){
            System.out.println(arr[i]);
        }

    }

    public static void main(String[] args) {
        int[] a = {1,4,2,3,6,8};
        question30 question30 = new question30();
        question30.find(3,a);
    }
}

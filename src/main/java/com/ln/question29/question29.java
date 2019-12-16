package com.ln.question29;

public class question29 {

    public void QuickSort(int[]arr,int start,int end){
        if(start<end){
        int index = arr[start];
        int i= start,j=end;
        while (i<j){
            while(i<j&&arr[j]>=index)
                j--;
            if(i<j){
                arr[i++]=arr[j];
            }
            while(i<j&&arr[i]<=index){
                i++;
            }
            if(i<j){
                arr[j--]=arr[i];
            }
        }
        arr[i]=index;
        QuickSort(arr,start,i-1);
        QuickSort(arr,i+1,end);}
    }
    public int GetMoreThanHalfNumber(int[]a){
        int index = a[0];
        int value=1;
        for(int i =0;i<a.length;i++){
            if(a[i]!=index){
                value--;
                if(value==0&&i!=a.length-1){
                    index = a[i+1];
                    value++;
                }
            }else {
                value++;
            }
        }
        return index;
    }



    public static void main(String[] args) {
        int a []={3,4,5,1,4,6,1,5,8,2,3};
        question29 question29 = new question29();
        question29.QuickSort(a,0,a.length-1);
        for(int index:a){
            System.out.println(index);
        }
       // System.out.println(question29.GetMoreThanHalfNumber(a));
    }

}

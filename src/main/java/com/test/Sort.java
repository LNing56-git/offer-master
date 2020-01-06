package com.test;

public class Sort {
    /**
     * 冒泡排序
     * @param arry
     */
    public static void   MaoPao(int[] arry){
        int length = arry.length;
        for (int i=length-1;i>=0;i--){
            for (int j=0;j<i;j++){
                if(arry[j]>arry[j+1]){
                    int temp1 = arry[j+1];
                    arry[j+1] = arry[j];
                    arry[j] = temp1;
                }
            }
        }
    }

    /**
     * 选择排序
     * @param arry
     */
    public static void XuanZe(int[] arry){
        int length = arry.length;
        for (int i=0;i<length-2;i++){
            int index = i;
            for (int j=i+1;j<length-1;j++){
                if (arry[j]>arry[index]){
                    continue;
                }else {
                    index = j;
                }
            }
            if (index!=i){
                int temp = arry[index];
                arry[index] = arry[i];
                arry[i] = temp;
            }
        }
    }

    /**
     * 插入排序
     */
    public static void InsertSort(int[] arry){
        int length = arry.length;
        for (int i=1;i<length-1;i++){
            int value = arry[i];
            int j=i-1;
            for (;j>=0;j--){
                if (value>arry[j]){
                    break;
                }else {
                    arry[j+1]=arry[j];
                }
            }
            arry[j+1]=value;
        }
    }

    /**
     * 快速排序
     * @param start
     * @param end
     * @param arry
     */
    public static void QuickSort(int start,int end,int[] arry){
        if(start<end){
        int i = start;
        int j = end;
        int index = arry[i];
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
        arry[i]=index;
        QuickSort(start,i,arry);
        QuickSort(i+1,end,arry);}
}

    /**
     * 归并排序
     * @param
     */
    public static void MergeSort(int[] arry,int start,int end){
        int mid = start+(end-start)/2;
        if (start<end){
            MergeSort(arry,start,mid);
            MergeSort(arry,mid+1,end);
            Merge(arry,start,mid,end);
        }
    }
    public static void Merge(int[]arry, int start,int mid,int end){
        int[]temp = new int[arry.length];
        int l = start,m=mid+1,k = start;
        while (l<=mid&&m<=end){
            if(arry[l]<=arry[m]){
                temp[k++]=arry[l++];
            }else {
                temp[k++]=arry[m++];
            }
        }
        while (l<=mid){
            temp[k++]=arry[l++];
        }
        while (m<=end){
            temp[k++]=arry[m++];
        }
        for (int i=start;i<=end;i++){
            arry[i]=temp[i];
        }
    }

    public static void main(String[] args) {
        int[] a = {1,3,4,2,1,6};
      //  MaoPao(a);
    //    XuanZe(a);
       // InsertSort(a);
    //    QuickSort(0,a.length-1,a);
        MergeSort(a,0,5);
        for (int num:
             a) {
            System.out.println(num);
        }
    }
}

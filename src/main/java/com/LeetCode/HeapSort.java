package com.LeetCode;

public class HeapSort {
    public void swap (int[] arry,int i,int j){
        int temp = arry[i];
        arry[i] = arry[j];
        arry[j] = temp;
    }
    public void sort(int[] arry){
        //从最后一个非叶子节点开始调整  因为从右到左，从下到上的方向调整
        //所以必须调整后就要重新调整他的子树（父节点可能会发生改变）
        for (int i = arry.length/2-1;i>=0;i--){
            adjustHeap(arry,arry.length,i);
        }
        for (int j = arry.length-1;j>0;j--){
            swap(arry,0,j);
            //只需要调用一次即可调整  从上到下调整
            adjustHeap(arry,j,0);
        }
    }

    public void adjustHeap(int []arry,int length,int index){
        int temp = arry[index];
        for (int i = 2*index+1;i<length;i = 2*i+1){
            if (i+1<index&&arry[i]<arry[i+1]){
                i++;
            }
            if (arry[i]>temp){
                arry[index] = arry[i];
                //交换后要调整下面的树
                index = i;
            }else {
                //如果父节点大于子节点就退出  因为下面的子树满足最大堆
                break;
            }
        }
        //把父节点的值放到最后交换的节点上
        arry[index] = temp;
    }

    public static void main(String[] args) {
        int[] arry = {2,4,1,6,3};
        HeapSort heapSort = new HeapSort();
        heapSort.sort(arry);
        for (int number:
             arry) {
            System.out.println(number);
        }
    }
}

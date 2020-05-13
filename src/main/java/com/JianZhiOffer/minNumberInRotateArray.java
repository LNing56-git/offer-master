package com.JianZhiOffer;

public class minNumberInRotateArray {

    public int minNumberInRotateArray(int [] array) {
        if (array.length==0){
            return 0;
        }
        int min = array[0];
        for (int i = 0;i<array.length;i++){
            if (array[i]<min){
                min = array[i];
                break;
            }
        }
        return min;
    }
}

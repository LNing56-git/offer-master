package com.JianZhiOffer;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class reOrderArray {
    public static void reOrderArray(int [] array) {
        int odd =0;
        int ou = 0;
        while (ou<array.length) {
           if (array[ou]%2==1){
               int temp = array[ou];
               for (int i = ou;i>odd;i--){
                   array[i] = array[i-1];
               }
               array[odd] = temp;
               odd++;
               ou++;
           }else {
               ou++;
           }
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        reOrderArray(a);
        for (int num: a){
            System.out.println(num);
        }
    }
}

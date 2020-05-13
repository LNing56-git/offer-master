package com.JianZhiOffer;

import java.util.ArrayList;

public class IsPopOrder {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        int i = 0;
        int j = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (i<pushA.length){
            list.add(pushA[i]);
            if (list.get(i)==popA[j]){
                j++;
            }
            i++;
        }
        i--;
        while (i>=0&&j<popA.length){
            if (popA[j]==list.get(i)){
                j++;
                i--;
            }else {
                i--;
            }
        }
        return j==popA.length;


    }
}

package com.JianZhiOffer;

public class NumberOf1 {
    public int NumberOf1(int n) {

        int  count = 0;
        while (n!=0){
            count++;
            n = n&(n-1);
        }
        return count;

        //负数  补码第一位永远为1
//        int res = 0;
//        int flag = 1;
//        while (n!=0){
//            if (n%2==1){
//                res++;
//            }
//            n=n>>1;
//        }
//        return res;
    }
}

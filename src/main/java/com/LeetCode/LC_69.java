package com.LeetCode;

public class LC_69 {
    public int mySqrt(int x) {
        long mid = x/2,result=1;
        if(x==1)return (int)result;
        for(long i=0;i<=mid;i++){
            if(i*i==x||(i+1)*(i+1)>x){
                result=i;
                break;
            }
        }
        return (int)result;
    }

    public static void main(String[] args) {
        System.out.println(new LC_69().mySqrt(2147483647));
    }
}

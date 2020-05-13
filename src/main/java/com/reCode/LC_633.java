package com.reCode;

public class LC_633 {
    public boolean judgeSquareSum(int c) {
        int sqrt = (int)Math.sqrt(c);
        int i = 0;
        int sum = 0;
        while (i<sqrt){
            sum = i*i+sqrt*sqrt;
            if (sum==c){
                return true;
            }
            if (sum<c){
                i++;
            }
            if (sum>c){
                sqrt--;
            }
        }
        return false;
    }
}

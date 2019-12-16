package com.LeetCode;

public class LC_633 {
    public boolean judeSquareSum(int c){
        double a = c;
        double s = Math.sqrt(a);
        int index = (int)s;
        boolean flag = false;
        int sum;
        int i =0,j=index;
        while (i<=j){
            sum = i*i+j*j;
            if(sum == c){
                flag = true;
                break;
            }
            if(sum<c){
                i++;
            }
            sum = i*i+j*j;
            if(sum>c){
                j--;
            }

        }
        return flag;

    }

    public static void main(String[] args) {
        LC_633 lc_633 = new LC_633();
        System.out.println(lc_633.judeSquareSum(2));
    }
}

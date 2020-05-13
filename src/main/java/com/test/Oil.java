package com.test;

/**
 * @author lining
 */
public class Oil {
    public static int code(int n){
        int sum = 0;
        while (n>=3){
            sum += n/3;
            int temp = n/3;
            n = n%3 + temp;
        }
        if (n==2){
            sum++;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(code(10));
    }
}

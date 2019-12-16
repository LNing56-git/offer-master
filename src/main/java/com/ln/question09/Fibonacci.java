package com.ln.question09;

import java.util.Scanner;

public class Fibonacci {
    public static long fibonacci(int n){
        if(n==0||n==1){
            return n;
        }
        return fibonacci(n-2)+fibonacci(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while (N!=-1){
            System.out.println(fibonacci(N));
            N = sc.nextInt();
        }
    }
}

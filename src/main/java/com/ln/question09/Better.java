package com.ln.question09;

import java.util.Scanner;

public class Better {
    public static long fibonacci(long n){
        if(n==1||n==0){
            return n;
        }else if(n==2){
            return 1;
        }
        long OneSum=1,TwoSum=1,TEMP=0;
        for(int i=2;i<n;i++){
            TEMP = OneSum+TwoSum;
            OneSum = TwoSum;
            TwoSum = TEMP;
        }
        return TEMP;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        while (true){
            System.out.println(fibonacci(a));
            System.out.println("是否继续（0|1）");
            a = sc.nextLong();
            if(a==0)break;
            a = sc.nextLong();
        }
    }
}

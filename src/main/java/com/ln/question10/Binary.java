package com.ln.question10;

import java.util.Scanner;

/**
 * @author lining
 * @since 2019/9/11
 * @Description 请实现一个函数，输入一个整数，输出该数二进制表示中1的个数
 */
public class Binary {

    public static int Numberof1(int n){
        int count = 0;
        while(n!=0){
            count ++;
            n &= (n-1);                         //通过与n-1进行&运算 实现将右边的1去掉
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("请输入十进制数：");
        int a = sc.nextInt();
//        System.out.println(Integer.bitCount(a));
        System.out.println("该数二进制中1的个数为"+Numberof1(a));
    }
}

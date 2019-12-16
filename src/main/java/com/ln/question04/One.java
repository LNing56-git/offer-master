package com.ln.question04;

import java.util.Arrays;

/**
 * @title 替换空格
 * @Description 请实现一个函数，把字符串中的每个空格替换成“%20”.例如“We are happy”,则输出“We%20are%20happy”
 * @author lining
 * @since 2019/9/4
 * @limit 时间复杂度不超过 O(n^2)
 */
public class One {
    public static void convert(char[] target){
        int len=target.length;
        int num=0;
        for(int i=0;i<len;i++){
                if(target[i]==' '){
                    num++;
                }
        }
        if(num==0){
            System.out.println("没有空格不作转换");
        }
        char[]temp=new char[target.length+2*num];
        int tempNum=0;
        for(int i=0;i<len;i++){
            if(target[i]==' '){
                temp[tempNum]='2';
                temp[tempNum+1]='0';
                temp[tempNum+2]='%';
                tempNum=tempNum+3;
            }else {
                temp[tempNum]=target[i];
                tempNum++;
            }
        }
        System.out.println(Arrays.toString(temp));
    }
    public static void main(String[] args) {
        char[]a ={' ','a','b','c',' ',' ',' ',' '};
        One.convert(a);
    }
}

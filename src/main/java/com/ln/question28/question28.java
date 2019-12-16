package com.ln.question28;

/**
 * @author lining
 * @since 2019/10/16
 * 回溯法 递归
 *
 */
public class question28 {
    public void Permutation(String string){
        if(string.length()==0||string.length()==1){
            System.out.println(string);
            return;
        }
        Permutation(string.toCharArray(),0);
    }
    public void Permutation(char[] str,int index){
        if(index==str.length-1){
            System.out.println(str);
        }
        for(int i=index;i<str.length;i++){
            char temp  =str[index];
            str[index] = str[i];
            str[i] = temp;
            Permutation(str,index+1);
            str[i]=str[index];
            str[index] = temp;
        }
    }

    public static void main(String[] args) {
        question28 question28 = new question28();
        question28.Permutation("abcd");
    }
}

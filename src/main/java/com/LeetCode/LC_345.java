package com.LeetCode;

import java.util.Arrays;

public class LC_345 {
    public String reverseVowels(String s) {
        char[] Arry = s.toCharArray();
        int j= s.length()-1;
        int i=0;
        char temp;
        while (i<j){

            while (!(Arry[j]=='a'||Arry[j]=='e'||Arry[j]=='i'||Arry[j]=='o'||Arry[j]=='u'||Arry[j]=='A'||Arry[j]=='E'||Arry[j]=='I'||Arry[j]=='O'||Arry[j]=='U')) {
                j--;
                if(j==0){
                    break;
                }
            }
            while (!(Arry[i]=='a'||Arry[i]=='e'||Arry[i]=='i'||Arry[i]=='o'||Arry[i]=='u'||Arry[i]=='A'||Arry[i]=='E'||Arry[i]=='I'||Arry[i]=='O'||Arry[i]=='U')) {
                i++;
                if(i==s.length()-1){
                    break;
                }
            }
            if(i<j){
                temp=Arry[j];
                Arry[j]=Arry[i];
                Arry[i]=temp;
                i++;
                j--;
            }
        }
     //   String a = Arrays.toString(Arry);
        return String.valueOf(Arry);
    }

    public static void main(String[] args) {
        LC_345 lc_345= new LC_345();
        String result = lc_345.reverseVowels("Ui");
        System.out.println(result);
    }
}

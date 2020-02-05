package com.LeetCode;

public class LC_409 {
    public int longestPalindrome(String s) {
        int[] rs = new int[256];
        int length = s.length();
        int o=0;
        for (int i = 0;i<length;i++){
            rs[s.charAt(i)]++;
        }
        for (int cnt:rs){
            o+=(cnt/2)*2;
        }
        if (o<length){
            o++;
        }
        return o;
    }
}

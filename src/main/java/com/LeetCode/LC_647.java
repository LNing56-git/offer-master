package com.LeetCode;

public class LC_647 {
    int cnt = 0;
    public int countSubstrings(String s) {
        for (int i =0; i<s.length();i++){
            extendSubString(s,i,i);   //奇数像外扩展
            extendSubString(s,i,i+1);  //偶数向外扩展
        }
        return cnt;
    }
    public void extendSubString(String s,int start,int end){
        while (start>=0&&end<s.length()&&s.charAt(start)==s.charAt(end)){
            start--;
            end++;
            cnt++;
        }
    }
}

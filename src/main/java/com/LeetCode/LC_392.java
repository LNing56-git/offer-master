package com.LeetCode;

public class LC_392 {
    public boolean isSubsequence1(String s, String t) {
        int sl = s.length();
        if(sl==0){
            return true;
        }
        char[] sstr = s.toCharArray();
        char[] tstr = t.toCharArray();
        int length = t.length();
        int i = 0;
        int j = 0;
        while (i<length){
                if(sstr[j]==tstr[i]){
                    j++;
                }
                i++;
                if(j==s.length()){
                    return true;
                }
        }
        return false;
    }
    public boolean isSubsequence(String s,String t){
        int i=0,index=0;
        while (index<s.length()&&t.indexOf(s.charAt(index),i)>i){
            i=t.indexOf(s.charAt(index),i);
            index++;
        }
        return index==s.length();
    }
    public static void main(String[] args) {

    }
}

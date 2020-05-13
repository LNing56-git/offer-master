package com.LeetCode;

public class LC_205 {
    public boolean isIsomorphic(String s, String t) {
        int[] rs = new int[256];
        int[] rt = new int[256];
        for (int i=0;i<s.length();i++){
            if (rs[s.charAt(i)]!=rt[t.charAt(i)]){
                return false;
            }
            rs[s.charAt(i)]=i+1;
            rt[t.charAt(i)]=i+1;
        }
        return true;
    }

    public static void main(String[] args) {
        String a = "ab";
        String b = "aa";
        new LC_205().isIsomorphic(a,b);
    }
}

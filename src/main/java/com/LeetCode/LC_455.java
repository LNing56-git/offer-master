package com.LeetCode;

import java.util.Arrays;

public class LC_455 {

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int gi=0,si=0;
        while (gi<g.length-1&&si<s.length-1){
            if(g[gi]<=s[si]){
                gi++;
                si++;
            }else {
                si++;
            }
        }
        return gi;
    }
    public static void main(String[] args) {
        int[] a={1,2,3},b={1,1};
        new LC_455().findContentChildren(a,b);
    }
}

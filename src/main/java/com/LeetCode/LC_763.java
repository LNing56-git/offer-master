package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LC_763 {

    public List<Integer> partitionLabels(String S) {
    //    char[] arr = S.toCharArray();
        int[] a =new int[26];
        for(int i=0;i<S.length();i++){
            a[S.charAt(i)-'a']=i;
        }
        List<Integer> list = new ArrayList<>();
        int archor=0,j=0;
        for(int i=0;i<S.length();i++){
            j = Math.max(j,a[S.charAt(i)-'a']);
            if(i==j){
                list.add(j-archor);
                archor=j;
            }
        }
        list.set(0,list.get(0)+1);
        return list;
    }
    public static void main(String[] args) {
        String S = "ababcbacadefegdehijhklij";
        List<Integer> list = new LC_763().partitionLabels(S);
        for(int num:list){
            System.out.println(num);
        }
    }
}

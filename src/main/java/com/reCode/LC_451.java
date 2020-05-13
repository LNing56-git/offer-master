package com.reCode;

import java.util.*;

public class LC_451 {
    public String frequencySort(String s) {
        char[] arry = s.toCharArray();
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for (char a:arry){
            hashMap.put(a,hashMap.getOrDefault(a,0)+1);
        }
        List<Character>[] lists = new ArrayList[s.length()];
        for (char temp :hashMap.keySet()){
            if (lists[hashMap.get(temp)]==null){
                lists[hashMap.get(temp)] = new ArrayList<>();
            }
            lists[hashMap.get(temp)].add(temp);
        }
        int i=s.length()-1;
        for (List<Character> temp:lists){
            if (temp==null){
                continue;
            }
            for (char c :temp){
                arry[i--] = c;
            }
        }
        return arry.toString();
    }

    public static void main(String[] args) {
        String  a = "tree";
        LC_451 lc_451 = new LC_451();
        String b = lc_451.frequencySort(a);
        System.out.println(b);
    }
}

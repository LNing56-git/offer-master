package com.LeetCode;

import java.util.HashMap;

/**
 * @auther lining
 * @since 2020/2/1
 */
public class LC_242 {
    public boolean isAnagram(String s, String t) {
//        char[] a = s.toCharArray();
//        char[] b = t.toCharArray();
//        char[] c = (s+t).toCharArray();
//        HashMap<Character,Integer> mapA = new HashMap<>();
//        HashMap<Character,Integer> mapB = new HashMap<>();
//        HashMap<Character,Integer> mapC = new HashMap<>();
//
//        for (char tempA:a){
//            mapA.put(tempA,mapA.getOrDefault(tempA,0)+1);
//        }
//        for (char tempB:b){
//            mapB.put(tempB,mapB.getOrDefault(tempB,0)+1);
//        }
//        for (char tempC:c){
//            mapC.put(tempC,mapC.getOrDefault(tempC,0)+1);
//        }
//        for (char temp:mapC.keySet()){
//            if(!mapA.containsKey(temp)||!mapB.containsKey(temp)||mapA.get(temp)!=mapB.get(temp)){
//                return false;
//            }
//        }
//        return true;
//    }
        int[]n = new int[26];
        for (char a:s.toCharArray()){
            n[a-'a']++;
        }
        for (char b:t.toCharArray()){
            n[b-'a']--;
        }
        for (int i = 0;i<26;i++){
            if (n[i]!=0)return false;
        }
        return true;
    }
}

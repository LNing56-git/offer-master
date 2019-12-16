package com.LeetCode;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class LC_451 {


    public static String frequencySort(String s) {
        if(s==null){
            return null;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        char[] arry = s.toCharArray();
        for(char a:arry){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        PriorityQueue<Character> queue = new PriorityQueue<>(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return map.get(o1)-map.get(o2);
            }
        });
        for(char temp:map.keySet()){
            queue.add(temp);
        }
        char[] res = new char[s.length()];
        int j = s.length()-1;
        char x;
        while (queue.size()!=0){
            x=queue.remove();
            int n = map.get(x);
            while (n--!=0){
                res[j]=x;
                if(j!=0){
                    j--;
                }
            }
        }
        return String.valueOf(res);
    }

    public static void main(String[] args) {
        System.out.println(frequencySort("tree"));
    }
}

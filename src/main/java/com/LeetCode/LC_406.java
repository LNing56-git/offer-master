package com.LeetCode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class LC_406 {
    public int[][] reconstructQueue(int[][] people) {

        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0]==o2[0]){
                        return o1[1]-o2[1];
                }
                return o2[0]-o1[0];
            }
        });
        LinkedList<int[]>list = new LinkedList<>();
        for(int[] a:people){
            list.add(a[1],a);
        }
        return list.toArray(new int[people.length][]);
    }

    public static void main(String[] args) {

    }
}

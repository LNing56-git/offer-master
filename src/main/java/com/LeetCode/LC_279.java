package com.LeetCode;


import javafx.util.Pair;

import java.util.LinkedList;
import java.util.Queue;

public class LC_279 {

    public int numSquares(int n) {
        Queue<Pair<Integer,Integer>> queue = new LinkedList<>();
        boolean[] visited =new boolean[n+1];
        visited[n]=true;
        queue.add(new Pair<>(n,0));
        while (queue.size()!=0){
            Pair<Integer,Integer> temp = queue.remove();
            int step = temp.getValue();
            int nextValue = temp.getKey();
            if(nextValue==0)return step;
            for(int i =1;nextValue-i*i>=0;i++){
               if(!visited[nextValue-i*i]){
                   if(nextValue-i*i==0){
                    return step+1;
                }else {
                    queue.add(new Pair<>(nextValue-i*i,step+1));
                    visited[nextValue-i*i]=true;
                }
            }
            }
        }
        return -1;
    }




    public static void main(String[] args) {
        System.out.println(new LC_279().numSquares(12));
    }
}

package com.LeetCode;

import java.util.*;

public class LC_452 {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        });
        int n=0;
        for(int i=0;i<points.length;i++){
            if(points[i][0]==0&&points[i][1]==0){
                continue;
            }
            for (int j=i+1;j<points.length;j++){
                if(points[j][0]==0&&points[j][1]==0){
                        continue;
                }
                if(points[j][0]>points[i][1]){
                    break;
                }
                points[j][0]=0;
                points[j][1]=0;
                n++;
            }
        }
        return points.length-n;
    }

    public static void main(String[] args) {
        int[][] a = {{1,2},{2,3},{3,4},{4,5}};
        System.out.println(new LC_452().findMinArrowShots(a));
//        LinkedList<int[]> list  = new LinkedList();
//        list.add(0,a[1]);
//        list.add(0,a[2]);
//        list.add(1,a[3]);
    }
}

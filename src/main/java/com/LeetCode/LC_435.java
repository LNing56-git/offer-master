package com.LeetCode;

import java.util.Arrays;
import java.util.Comparator;

public class LC_435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        });
        int n=0;
        for(int i=0;i<intervals.length;i++){
            if(intervals[i][0]==0&&intervals[i][1]==0){
                continue;
            }
            for(int j=i+1;j<intervals.length;j++){
                if(intervals[j][0]==0&&intervals[j][1]==0){
                    continue;
                }
                if(intervals[j][0]>=intervals[i][1]){
                    break;
                }
                intervals[j][0]=0;
                intervals[j][1]=0;
                n++;
            }
        }

        return n;
    }


    public static void main(String[] args) {
            int[][] a = {{1,2},{1,2},{1,2}};
        System.out.println(new LC_435().eraseOverlapIntervals(a));
    }
}

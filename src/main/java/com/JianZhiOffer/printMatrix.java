package com.JianZhiOffer;

import java.util.ArrayList;
import java.util.List;

public class printMatrix {
    public static ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();

        int rows = matrix.length;
        int col = matrix[0].length;
        if (matrix==null||rows<=0||col<=0){
            return null;
        }
        int start=0;
        while (start*2<rows&&start*2<col){
            print(matrix,col,rows,start,list);
            start++;
        }
        return list;
    }
    public static void print(int[][] matrix,int col,int ros,int start ,ArrayList<Integer>list){
            int endy = ros-1-start;
            int endx = col-1-start;
            for (int i=start;i<=endx;i++){
                list.add(matrix[start][i]);
            }
            if (start<endy){
            for (int i=start+1;i<=endy;i++){
                list.add(matrix[i][endx]);
            }}
            if (start<endy&&start<endx){
            for (int i=endx-1;i>=start;i--){
                list.add(matrix[endy][i]);
            }}
            if (start<endx&&start<endy-1){
            for (int i=endy-1;i>=start+1;i--){
                list.add(matrix[i][start]);
            }}
    }

    public static void main(String[] args) {
        int[][]a={{1},{2},{3},{4},{5}};
        ArrayList<Integer> list = printMatrix(a);
        for (int num:list){
            System.out.println(num);
        }
    }
}

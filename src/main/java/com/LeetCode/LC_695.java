package com.LeetCode;

public class LC_695 {
    public int maxAreaOfIsland(int[][] grid) {
            if(grid==null||grid.length==0){
                return 0;
            }
            int l = grid.length;
            int m = grid[0].length;
            int maxArea = 0;
            for (int i=0;i<l;i++){
                for (int j=0;j<m;j++){
                    maxArea=Math.max(maxArea,dfs(grid,i,j));
                }
            }
            return maxArea;
    }
    public int dfs(int[][] grid,int row,int col){
        int[][] direction = {{-1,0},{0,-1},{1,0},{0,1}};
        if(row>=grid.length||row<0||col>=grid[0].length||col<0||grid[row][col]==0){
            return 0;
        }
        int Area = 1;
        grid[row][col]=0;
        for (int[] temp:direction){
                Area+=dfs(grid,row+temp[0],col+temp[1]);
        }
        return Area;
    }
    public static void main(String[] args) {
        int [][] a = {{0,0,1,0,0,0,0,1,0,0,0,0,0},
 {0,0,0,0,0,0,0,1,1,1,0,0,0},
 {0,1,1,0,1,0,0,0,0,0,0,0,0},
 {0,1,0,0,1,1,0,0,1,0,1,0,0},
 {0,1,0,0,1,1,0,0,1,1,1,0,0},
 {0,0,0,0,0,0,0,0,0,0,1,0,0},
 {0,0,0,0,0,0,0,1,1,1,0,0,0},
 {0,0,0,0,0,0,0,1,1,0,0,0,0}};
        System.out.println(new LC_695().maxAreaOfIsland(a));

    }
}

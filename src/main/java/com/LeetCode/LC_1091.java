package com.LeetCode;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class LC_1091 {
    class Node{
        int x;
        int y;
        int len;
        public Node(int x, int y,int len) {
            this.x = x;
            this.y = y;
            this.len = len;
        }
    }
    public int shortestPathBinaryMatrix(int[][] grid) {
        int[][]direction ={{-1,-1},{-1,0},{-1,1},{1,-1},{1,0},{1,1},{0,-1},{0,1}};
        Queue<Node> queue = new LinkedList();
        int lx = grid.length;
        int ly = grid[0].length;
        if(grid[0][0]==1||grid[lx-1][ly-1]==1)return -1;
        if(lx==1&&ly==1&&grid[0][0]==0)return 1;
        queue.add(new Node(0,0,1));
        while (!queue.isEmpty()){
            Node temp = queue.remove();
            int x=temp.x;
            int y = temp.y;
            for(int[] d:direction){
                if(x+d[0]<0||x+d[0]>lx-1||y+d[1]<0||y+d[1]>ly-1||grid[x+d[0]][y+d[1]]==1){
                    continue;
                }
                Node node = new Node(x+d[0],y+d[1],temp.len+1);
                grid[x+d[0]][y+d[1]]=1;
                if(x+d[0]==lx-1&&y+d[1]==ly-1){
                    return node.len;
                }
                queue.add(node);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [][]a = {{0}};
        System.out.println(new LC_1091().shortestPathBinaryMatrix(a));
    }
}

package com.test;


import java.util.LinkedList;
import java.util.Queue;
class Node{
    int x;
    int y;
    int val;

    public Node(int x, int y, int val) {
        this.x = x;
        this.y = y;
        this.val = val;
    }

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class BFS {
    public int bfs(int[][] grid){
        int[][] direction={{1,0},{-1,0},{0,1},{0,-1},{-1,-1},{1,-1},{-1,1},{1,1}};
        int l=grid.length;
        int m=grid[0].length;
        if(grid[0][0]==0||grid[l-1][m-1]==0){
            return 0;
        }
        Queue<Node> queue = new LinkedList();
        queue.add(new Node(0,0,1));
        while (!queue.isEmpty()){
            Node node = queue.remove();
            for (int[] temp:direction){
                if(node.x+temp[0]>=l||node.x+temp[0]<0||node.y+temp[1]>=m||node.y+temp[1]<0||grid[node.x+temp[0]][node.y+temp[1]]==0){
                    continue;
                }
                grid[node.x+temp[0]][node.y+temp[1]]=0;
                if(node.x+temp[0]==l-1&&node.y+temp[1]==m-1){
                    return node.val+1;
                }
                queue.add(new Node(node.x+temp[0],node.y+temp[1]));
            }
        }
        return -1;
    }


    public static void main(String[] args) {

    }
}

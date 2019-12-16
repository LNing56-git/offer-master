package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){val=x;}
        }
public class LC_95 {

    public List<TreeNode>generateTrees(int n){
        if(n<1)return new ArrayList<TreeNode>();
        return generateTrees(1,n);
    }

    public List<TreeNode> generateTrees(int s,int n) {
            List<TreeNode> list = new ArrayList<>();
            if(s>n){
               return list;
            }
            for(int i=s;i<=n;i++){
                List<TreeNode> left = generateTrees(s,i-1);
                List<TreeNode> right = generateTrees(i+1,n);
                for(TreeNode l:left){
                    for (TreeNode r:right){
                        TreeNode head =new TreeNode(i);
                        head.left=l;
                        head.right=r;
                        list.add(head);
                    }
                }
            }
            return list;
    }
    public static void main(String[] args) {
            List<TreeNode> treeNodes = new ArrayList<>();
            treeNodes = new LC_95().generateTrees(2);


    }
}

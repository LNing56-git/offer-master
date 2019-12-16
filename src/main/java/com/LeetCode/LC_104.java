package com.LeetCode;

public class LC_104 {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int left = maxDepth(root.left)+1;
        int right = maxDepth(root.right)+1;
        return left>right?left:right;
    }
    public static void main(String[] args) {

    }
}

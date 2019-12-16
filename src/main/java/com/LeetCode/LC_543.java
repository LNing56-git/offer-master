package com.LeetCode;

public class LC_543 {
    private int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
       X(root);
       return max;
    }
    public int X(TreeNode root){
        if(root==null){
            return 0;
        }
        int left = X(root.left);
        int right = X(root.right);
        max = max>(right+left)?max:right+left;
        return left>right?left+1:right+1;
    }
    public static void main(String[] args) {

    }
}

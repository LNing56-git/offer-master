package com.LeetCode;

public class LC_111 {
   
    public int minDepth(TreeNode root) {
        if(root==null)return 0;
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        if(left==0||right==0)return left+right+1;
        int result = left>right?right:left;
        return result+1;
    }
    public static void main(String[] args) {

    }
}

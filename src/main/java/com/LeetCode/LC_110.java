package com.LeetCode;

import static java.lang.Math.abs;

public class LC_110 {
    private boolean re = true;
    public boolean isBalanced(TreeNode root) {
            maxDepth(root);
            return re;
    }
    public int maxDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        if(abs(left-right)>1)re=false;
        return left>right?left+1:right+1;
    }
}

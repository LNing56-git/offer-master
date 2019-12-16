package com.LeetCode;

/**
 * 计算给定二叉树的所有左叶子之和
 */
public class LC_404 {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null)return 0;
        return sum(root.left)+sumOfLeftLeaves(root.right);
    }
    public int sum(TreeNode treeNode){
        if(treeNode==null)return 0;
        if(treeNode.left==null&&treeNode.right==null)return treeNode.val;
        return sum(treeNode.left)+sumOfLeftLeaves(treeNode.right);
    }
}

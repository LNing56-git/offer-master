package com.LeetCode;

public class ConvertBstToGreaterTree {
    private int sum = 0;
    public TreeNode convertBst(TreeNode root){
        sum(root);
        return root;
    }
    public void sum(TreeNode treeNode) {
        if (treeNode==null)return;
        sum(treeNode.right);
        sum += treeNode.val;
        treeNode.val=sum;
        sum(treeNode.left);
    }
}

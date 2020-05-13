package com.JianZhiOffer;

public class Mirror {
    public void Mirror(TreeNode root) {
        if (root==null){
            return;
        }else {
            reverse(root);
        }

    }
    public  TreeNode reverse(TreeNode treeNode){
        if (treeNode==null){
            return null;
        }
        TreeNode left = treeNode.left;
        TreeNode right = treeNode.right;
        treeNode.left = reverse(right);
        treeNode.right = reverse(left);
        return treeNode;
    }
}

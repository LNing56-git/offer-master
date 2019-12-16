package com.LeetCode;

public class LC_226 {
    public TreeNode invertTree(TreeNode root) {
            if(root==null){
                return null;
            }
            TreeNode temp=new TreeNode(1);
            temp=root.right;
            root.right=invertTree(root.left);
            root.left=invertTree(temp);
            return root;
    }
    public static void main(String[] args) {

    }
}

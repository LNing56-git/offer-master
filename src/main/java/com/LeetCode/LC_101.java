package com.LeetCode;

public class LC_101 {
    public boolean isSymmetric(TreeNode root) {
        if (root==null)return true;
        return isS(root.left,root.right);
    }
    public boolean isS(TreeNode t1,TreeNode t2){
        if(t1==null&&t2==null)return true;
        if(t1==null||t2==null)return false;
        if(t1.val!=t2.val)return false;
        return isS(t1.left,t2.right)&&isS(t1.right,t2.left);
    }
    public static void main(String[] args) {


    }
}

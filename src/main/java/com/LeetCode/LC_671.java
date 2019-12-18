package com.LeetCode;

import java.util.Stack;

public class LC_671 {


    public  static int findSecondMinimumValue(TreeNode root) {
        if(root==null)return -1;
        if(root.left==null&&root.right==null)return -1;
        int left = root.left.val;
        int right = root.right.val;
        if(left==root.val) left = findSecondMinimumValue(root.left);
        if(right==root.val) right = findSecondMinimumValue(root.right);
        if(left!=-1&&right!=-1) return Math.min(left,right);
        if(left!=-1)return left;
        return right;
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(2);
        TreeNode t2 = new TreeNode( 2);
        TreeNode t3 = new TreeNode( 2);
        TreeNode t4 = new TreeNode( 2);
        TreeNode t5 = new TreeNode( 2);

        t1.left=t2;
        t1.right=t3;
        t3.left=t4;
        t3.right=t5;
        System.out.println(findSecondMinimumValue(t1));
    }
}

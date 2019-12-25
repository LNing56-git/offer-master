package com.LeetCode;

/**
 * 打家劫舍  动态规划
 * root[0] = Math.max(rob(root.left)[0], rob(root.left)[1]) + Math.max(rob(root.right)[0], rob(root.right)[1])
 * root[1] = rob(root.left)[0] + rob(root.right)[0] + root.val;
 *任何一个节点能偷到的最大钱的状态可以定义为
 *
 * 当前节点选择不偷: 当前节点能偷到的最大钱数 = 左孩子能偷到的钱 + 右孩子能偷到的钱
 * 当前节点选择偷: 当前节点能偷到的最大钱数 = 左孩子选择自己不偷时能得到的钱 + 右孩子选择不偷时能得到的钱 + 当前节点的钱数
 *
 */
public class LC_337 {
//    public int rob(TreeNode root) {
//        if(root==null)return 0;
//        int val = root.val;
//        if(root.left!=null)  val += rob(root.left.left)+rob(root.left.right);
//        if(root.right!=null) val += rob(root.right.left)+rob(root.right.right);
//        return  Math.max(val,rob(root.left)+rob(root.right));
//    }
    public int rob(TreeNode root){
        if(root==null)return 0;
        return Math.max(dt(root)[0],dt(root)[1]);
    }
    public int[] dt(TreeNode treeNode){
        int[] t = new int[2];
        if(treeNode==null)return t;
        int[] left = dt(treeNode.left);
        int[] right = dt(treeNode.right);
        t[0] = Math.max(left[0],left[1])+Math.max(right[0],right[1]);
        t[1] = left[0]+right[0]+treeNode.val;
        return t;
    }

}

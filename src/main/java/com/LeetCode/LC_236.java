package com.LeetCode;

/**
 * 二叉树的最近公共祖先
 * 从一个节点的左边和右边开始找
 * 如果左子树和右子树（都不为空）都找了那么该节点就为最近公共祖先
 * 如果左边找到了右边没有找到  那么左边就是该根节点 反之亦然
 */
public class LC_236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if(root==null||root==p||root==q){
                return root;
            }
            TreeNode left = lowestCommonAncestor(root.left,p,q);
            TreeNode right  = lowestCommonAncestor(root.right,p,q);
            if(left!=null&&right!=null){
                return root;
            }
            return left!=null?left:right;
    }
}

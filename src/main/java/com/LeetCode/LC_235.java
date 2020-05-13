package com.LeetCode;

/**
 * bst的最近公共祖先
 * 从上往下如果节点的值在p~q之间那么出现的第一个这样的节点就是最近的节点
 */
public class LC_235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root.val>p.val&&root.val>q.val){
            return lowestCommonAncestor(root.left,p,q);
        }
        if (root.val<p.val&&root.val<q.val){
            return lowestCommonAncestor(root.right,p,q);
        }
        return root;
    }
}

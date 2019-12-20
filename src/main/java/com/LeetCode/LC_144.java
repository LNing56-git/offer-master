package com.LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 非递归求 二叉树前序遍历
 */
public class LC_144 {
//    List<Integer>list = new ArrayList<>();
//    public List<Integer> preorderTraversal(TreeNode root) {
//            dfs(root);
//            return list;
//
//    }
//    public void dfs(TreeNode treeNode){
//        if(treeNode==null)return;
//        list.add(treeNode.val);
//        preorderTraversal(treeNode.left);
//        preorderTraversal(treeNode.right);
//    }
public List<Integer> preorderTraversal(TreeNode root) {
    Stack stack = new Stack();
    List<Integer> list = new ArrayList<>();
    if(root==null)return list;
    stack.add(root);
    while(stack.size()!=0){
        TreeNode treeNode = (TreeNode) stack.pop();
        list.add(treeNode.val);
        if(treeNode.right!=null)stack.add(treeNode.right);
        if(treeNode.left!=null)stack.add(treeNode.left);
    }
    return list;
    }
}

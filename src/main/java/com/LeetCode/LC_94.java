package com.LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LC_94 {
//    List<Integer> list = new ArrayList<>();
//    public List<Integer> inorderTraversal(TreeNode root) {
//            dfs(root);
//            return list;
//    }
//    public void dfs(TreeNode treeNode){
//        if(treeNode==null)return;
//        dfs(treeNode.left);
//        list.add(treeNode.val);
//        dfs(treeNode.right);
//    }
public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> list = new ArrayList<>();
    Stack<TreeNode> stack = new Stack<>();
    if(root==null)return list;
    TreeNode cur = root;
    while (cur!=null||stack.size()!=0){
        while (cur!=null){
            stack.push(cur);
            cur=cur.left;
        }
        TreeNode treeNode = stack.pop();
        list.add(treeNode.val);
        cur=treeNode.right;
    }
    return list;
}
}

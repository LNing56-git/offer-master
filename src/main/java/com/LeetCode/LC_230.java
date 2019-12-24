package com.LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class LC_230 {
    /**
     * 中序遍历
     * @param args
     */
//    public int kthSmallest(TreeNode root, int k) {
//        List<Integer> list = new ArrayList<>();
//        Stack<TreeNode> stack = new Stack<>();
//        TreeNode cur = root;
//        while (cur!=null||stack.size()!=0){
//            while (cur!=null){
//                stack.push(cur);
//                cur=cur.left;
//            }
//            TreeNode treeNode = stack.pop();
//            list.add(treeNode.val);
//            cur=treeNode.right;
//        }
//        return list.get(k-1);
//    }

    /**
     * 递归
     * @param
     */
    public int kthSmallest(TreeNode root, int k) {
        int leftCount = count(root.left);
        if(leftCount==k-1)return root.val;
        if(leftCount>k-1) return kthSmallest(root.left,k);
        return kthSmallest(root.right,k-leftCount-1);

    }
    public int count(TreeNode treeNode){
        if(treeNode==null)return 0;
        return count(treeNode.left)+count(treeNode.right)+1;
    }
    public static void main(String[] args) {

    }
}

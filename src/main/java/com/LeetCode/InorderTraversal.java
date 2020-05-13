package com.LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> result = new ArrayList<>();
        TreeNode current = root;
        while (current!=null||!stack.isEmpty()){
            while (current!=null){
                stack.push(current);
                current = current.left;
            }
            TreeNode treeNode = stack.pop();
            result.add(treeNode.val);
            current = treeNode.right;
        }
        return result;
    }
}

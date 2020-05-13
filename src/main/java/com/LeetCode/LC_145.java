package com.LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * 非递归后序遍历二叉树
 */
public class LC_145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> re = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root==null){
            return re;
        }
        stack.push(root);
        while (stack.size()!=0){
          TreeNode treeNode = stack.pop();
          re.add(treeNode.val);
          if(treeNode.left!=null){
              stack.push(treeNode.left);
          }
          if(treeNode.right!=null){
              stack.push(treeNode.right);
          }
        }
        Collections.reverse(re);
        return re;
    }
}

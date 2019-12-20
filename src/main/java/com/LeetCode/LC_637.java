package com.LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 层次遍历二叉树
 * bfs
 */
public class LC_637 {
    public List<Double> averageOfLevels(TreeNode root) {
        if(root==null)return null;
        List<Double> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (queue.size()!=0){
            int n = queue.size();
            double sum = 0;
            for (int i=0;i<n;i++){
                TreeNode treeNode = queue.remove();
                sum+=treeNode.val;
                if(treeNode.left!=null)queue.add(treeNode.left);
                if(treeNode.right!=null)queue.add(treeNode.right);
            }
            result.add((double)(sum/n));
        }
        return result;
    }
}

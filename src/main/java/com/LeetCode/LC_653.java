package com.LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LC_653 {
    public  boolean findTarget(TreeNode root, int k) {
        List<Integer> list=  new ArrayList<>();
        sum(root,list);
        int i = 0;
        int j = list.size()-1;
        while (list.get(j)>k){
            j--;
        }
        while (i<j){
            if (list.get(i)+list.get(j)>k){
                j--;
            }
            if (list.get(i)+list.get(j)<k){
                i++;
            }
            if (list.get(i)+list.get(j)==k){
                return true;
            }
        }
        return false;
    }
    public void sum(TreeNode treeNode,List<Integer> list){
        if (treeNode==null){
            return;
        }
        sum(treeNode.left,list);
        list.add(treeNode.val);
        sum(treeNode.right,list);
    }

    public static void main(String[] args) {

    }
}

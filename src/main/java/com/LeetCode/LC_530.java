package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * bst求倒数第二小的元素
 */
public class LC_530 {
//    private TreeNode pre = null;
//    private int min = Integer.MAX_VALUE;
//    public int getMinimumDifference(TreeNode root) {
//        convert(root);
//        return min;
//    }
//    public void convert(TreeNode treeNode){
//        if (treeNode==null)return;
//        convert(treeNode.left);
//        min = Math.min(treeNode.val-pre.val,min);
//        pre = treeNode;
//        convert(treeNode.right);
//    }
public int getMinimumDifference(TreeNode root) {
    List<Integer> list=  new ArrayList<>();
    convert(root,list);
    int min= Integer.MAX_VALUE;
    for (int i=0;i<list.size()-2;i++){
        min = Math.min(min,list.get(i+1)-list.get(i));
    }
    return min;
}
    public void convert(TreeNode treeNode,List<Integer> list){
        if (treeNode==null)return;
        convert(treeNode.left,list);
        list.add(treeNode.val);
        convert(treeNode.right,list);
    }
}

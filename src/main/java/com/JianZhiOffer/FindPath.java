package com.JianZhiOffer;

import java.util.ArrayList;

public class FindPath {
    ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    ArrayList<Integer> path = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if (root==null){
            return res;
        }
        find(root,target);
        return res;
    }
    public void find(TreeNode treeNode,int target){
        if (treeNode==null){
            return;
        }
        path.add(treeNode.val);
        if (target-treeNode.val==0&&treeNode.left==null&&treeNode.right==null){
            res.add(new ArrayList<>(path));
        }
        find(treeNode.left,target-treeNode.val);
        find(treeNode.right,target-treeNode.val);
        path.remove(path.size()-1);
        return;
    }
}

package com.JianZhiOffer;

import java.util.ArrayList;

public class PrintFromTopToBottom {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        if (root==null){
            return null;
        }
        ArrayList<Integer>  res = new ArrayList<>();
        ArrayList<TreeNode> queue = new ArrayList<>();
        queue.add(root);
        while (queue.size()!=0){
            TreeNode temp = queue.remove(0);
            res.add(temp.val);
            if (temp.left!=null){
                queue.add(temp.left);
            }
            if (temp.right!=null){
                queue.add(temp.right);
            }
        }
        return res;
    }
}

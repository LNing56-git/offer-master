package com.JianZhiOffer;

public class HasSubtree {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean result = false;
        if (root1!=null&&root2!=null){
            if (root1.val==root2.val){
                result = Does(root1,root2);
            }
            if (!result){
                result = Does(root1.left,root2);
            }
            if (!result){
                result = Does(root1.right,root2);
            }
        }
        return result;
    }
    public boolean Does(TreeNode root1,TreeNode root2){
        if (root2==null){
            return true;
        }
        if (root1==null){
            return false;
        }
        if (root1.val!=root2.val) {
            return false;
        }else {
            return Does(root1.left,root2.left)&&Does(root1.right,root2.right);
        }
    }
}

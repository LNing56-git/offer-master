package com.LeetCode;

public class LC_572 {
    public static boolean isSubtree(TreeNode s, TreeNode t) {
        if(s==null)return false;
        return isS(s,t)||isSubtree(s.left,t)||isSubtree(s.right,t);
    }
    public static boolean isS(TreeNode s,TreeNode t){
        if(s==null&&t==null)return true;
        if(s==null||t==null)return false;
        if(s.val!=t.val)return false;
        return isS(s.left,t.left)&&isS(s.right,t.right);
    }

}

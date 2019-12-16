package com.LeetCode;

public class LC_437 {
    public static int pathSum(TreeNode root, int sum) {
        if(root==null)return 0;
        return sum(root,sum)+pathSum(root.right,sum)+pathSum(root.left,sum);

    }
    public static int sum(TreeNode root,int sum){
        if(root==null){
            return 0;
        }
        int te = 0;
        if(root.val==sum) te++;
        te += sum(root.left,sum-root.val)+sum(root.right,sum-root.val);
        return te;
    }

}

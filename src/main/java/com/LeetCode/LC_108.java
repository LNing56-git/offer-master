package com.LeetCode;

/**
 * 有序数组构造成bst
 * 二分法  最中间的是根节点
 */
public class LC_108 {
    public TreeNode sortedArrayToBST(int[] nums) {
            if (nums.length==0)return null;
            return convert(nums,0,nums.length-1);
    }
    public TreeNode convert(int[]nums,int start,int end){
            if (start>end) {
                return null;
            }
            int mid = (start+end)/2;
            TreeNode root = new TreeNode(nums[mid]);
            root.left = convert(nums,start,mid-1);
            root.right = convert(nums,mid+1,end);
            return root;
    }
}

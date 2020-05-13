package com.JianZhiOffer;



public class reConstructBinaryTree {
    public TreeNode reConstructBinaryTree(int [] pre, int [] in) {
        return construct(pre,0,pre.length-1,in,0,in.length-1);
    }
    public TreeNode construct(int[] pre,int preStart,int preEnd,int[] in,int inStart,int inEnd){
        if (preStart>preEnd){
            return null ;
        }
        TreeNode treeNode = new TreeNode(pre[preStart]);
        int i = inStart;
        while (in[i]!=pre[preStart]){
            i++;
        }
        treeNode.left = construct(pre,preStart+1,preStart+i-inStart,in,inStart,i-1);
        treeNode.right = construct(pre,preStart+i-inStart+1,preEnd,in,i+1,inEnd);
        return treeNode;
    }
}

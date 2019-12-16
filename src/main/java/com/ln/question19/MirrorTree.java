package com.ln.question19;

public class MirrorTree {
    public  void  exchange(TreeNode treeNode){
        if(treeNode==null){
            return;
        }
        TreeNode temp = new TreeNode();
        if(treeNode.leftChild!=null||treeNode.rightChild!=null){
              temp=treeNode.rightChild;
              treeNode.rightChild=treeNode.leftChild;
              treeNode.leftChild=temp;
        }
        if(treeNode.leftChild!=null) exchange(treeNode.leftChild);
        if(treeNode.rightChild!=null) exchange(treeNode.rightChild);
    }
    public void midPrint(TreeNode treeNode){
        if(treeNode==null)return;
        midPrint(treeNode.leftChild);
        System.out.print(treeNode.value);
        midPrint(treeNode.rightChild);
    }


    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        t1.leftChild=t2;
        t1.rightChild=t3;
        t2.leftChild=t4;
        t2.rightChild=t5;
//        TreeNode q = new TreeNode(2);
//        TreeNode q1 = new TreeNode(4);
//        TreeNode q2 = new TreeNode(5);
//        q.leftChild=q1;
//        q.rightChild=q2;
        MirrorTree mirrorTree = new MirrorTree();
        mirrorTree.midPrint(t1);
        System.out.println();
        mirrorTree.exchange(t1);
        mirrorTree.midPrint(t1);
    }

}

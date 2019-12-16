package com.ln.BinarySearchTree;

/**
 * @title 对二叉树进行操作
 */
class Node {
    private int value;
    protected Node leftChild;
    protected Node rightChild;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

public class BSTOperation {
    public Node searchBSTByRecursion(Node root,int value){
            if(root==null){
                return null;
            }
            if(value == root.getValue()){
                return root;
            }else if(value<root.getValue()){
                return searchBSTByRecursion(root.leftChild,value);
            }else if (value>root.getValue()){
                return searchBSTByRecursion(root.rightChild,value);
            }
            return null;

    }
    public void  insertBST(int value,Node root){
        if(root==null){
            root = new Node(value);
            return;
        }
        if(root.getValue()<value){
            if(root.rightChild==null){
                root.rightChild=new Node(value);
            }else {
                insertBST(value,root.rightChild);
            }
        }else if(root.getValue()>value){
            if(root.leftChild==null){
                root.leftChild=new Node(value);
            }else {
                insertBST(value,root.leftChild);
            }
        }else {
            System.out.println("节点已经存在，插入失败");
            return;
        }
    }
    //删除结点
    public void deleteBST(int value,Node root){

    }
}

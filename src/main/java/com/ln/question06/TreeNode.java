package com.ln.question06;

/**
 * @Desription 二叉树
 * @author lining
 * @since 2019/9/5
 * @param <T>
 */
public class TreeNode<T> {
    private T data;
    TreeNode leftNode;
    TreeNode rightNode;
    TreeNode root;

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode(T data, TreeNode leftNode, TreeNode rightNode) {
        this.data = data;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "data=" + data +
                '}';
    }

    public TreeNode(T data, TreeNode leftNode, TreeNode rightNode, TreeNode root) {
        this.data = data;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
        this.root = root;
    }

    public TreeNode(T data) {
        this.data = data;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

}

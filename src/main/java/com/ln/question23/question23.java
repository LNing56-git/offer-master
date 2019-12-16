package com.ln.question23;




import java.util.Deque;
import java.util.LinkedList;

/**
 * @author lining
 * @since 2019/9/27
 * 通过一个队列来存放结点信息，先
 * 把结点放入队列中，然后通过判断
 * 队列是否为空来判断树是否遍历完
 * 进去循环弹出队头的结点并打印其
 * 值再将其结点的左子树结点存入队
 * 列中，将结点的右子树存入结点中
 * 再进入循环根据队列的特点实现程
 * 序要求
 *
 */
public class question23 {
    public void PrintFromTopToBottom(TreeNode treeNode){
        Deque<TreeNode> deque = new LinkedList();
        deque.offer(treeNode);
        while(deque.size()!=0){
            TreeNode node =  deque.pop();
            System.out.print(node.value+"  ");
            if(node.left!=null){
                deque.offer(node.left);
            }
            if(node.right!=null){
                deque.offer(node.right);
            }
        }


    }


    public static void main(String[] args) {

        TreeNode left1 = new TreeNode(4, null, null);
        TreeNode left2 = new TreeNode(5, null, null);
        TreeNode left = new TreeNode(1, left1, left2);
        TreeNode right = new TreeNode(3, null, null);
        TreeNode root = new TreeNode(2, left, right);
        question23 q = new question23();
        q.PrintFromTopToBottom(root);
    }
}

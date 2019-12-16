package com.ln.question25;

import java.util.Stack;

public class question25 {

    Stack<BinaryTree> stack = new Stack();
    public void FindTagert(BinaryTree tree,int targert){
        if(tree==null){
            return;
        }
        if(targert-tree.value==0){
          //  stack.push(tree);
            for(BinaryTree binaryTree :stack){
                System.out.print(binaryTree.value+" ");
            }
            System.out.print(targert+" ");
            System.out.println();
            return;
        }
        if(targert-tree.value>0){
            stack.push(tree);
            targert-=tree.value;
            FindTagert(tree.left,targert);
            FindTagert(tree.right,targert);
            stack.pop();
        }
        if(targert-tree.value<0||tree.left==null&&tree.right==null){

            return;
        }


    }

    public static void main(String[] args) {
        question25 question25 = new question25();
        BinaryTree left1 = new BinaryTree(4, null, null);
        BinaryTree left2 = new BinaryTree(7, null, null);
        BinaryTree left = new BinaryTree(5, left1, left2);
        BinaryTree right = new BinaryTree(12, null, null);
        BinaryTree root = new BinaryTree(10, left, right);
        question25.FindTagert(root,22);
    }
}

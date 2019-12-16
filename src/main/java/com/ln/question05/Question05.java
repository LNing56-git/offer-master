package com.ln.question05;

import java.util.Stack;

/**
 * @title 输入一个链表的头结点，从尾到头反过来打印节点信息
 * @Description 考虑递归！但是如果链表过长就会浪费时间，并且超出栈顶
 * @author lining
 * @since 2019/9/4
 */
public class Question05{

    public void printNodes(Node head){
        if(head==null)return;
        Stack<Node> nodes = new Stack<>();  //创建栈
        while(head!=null){                  //如果子节点不为空
            nodes.push(head);               //就将该节点压栈
            head=head.next;                 //继续下一个节点
    }
        while (!(nodes.empty())){
            System.out.println(nodes.pop().val);        //从栈顶释放节点同时打印节点的信息
        }
    }


    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        n1.next=n2;
        n2.next=n3;
        Question05 question05 = new Question05();
        question05.printNodes(n1);
    }



}

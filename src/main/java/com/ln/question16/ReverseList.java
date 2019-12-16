package com.ln.question16;

/**
 * @author lining
 * @since 2019/9/19
 * 逆转链表
 */
public class ReverseList {
    public static Node reverseNode(Node head){
        Node preNode = null;
        Node curNode = head;
        Node headNode = null;
        while (curNode!=null){
            Node nextNode = curNode.next;
            if(curNode.next==null){
                    headNode=curNode;
            }
            curNode.next = preNode; //将该结点的下一结点指向一个前置结点
            preNode = curNode;   //将前置结点指向当前结点
            curNode = nextNode;   // 将当前结点后移
        }
        return headNode;
    }


    public static void main(String[] args) {
            Node n1 = new Node(1);
            Node n2 = new Node(2);
            Node n3 = new Node(3);
            n1.next=n2;
            n2.next=n3;
            Node n = reverseNode(n1);
            while (n!=null){
                System.out.println(n.value);
                n=n.next;
            }
    }

}

package com.ln.question15;

/**
 * @author lining
 * @since 2019/9/18
 */
public class FindNode {


    public static Node find(int n,Node node){
        Node head=node;
        if(n<=0){
            throw new RuntimeException("n为正数");
        }
        if(node==null){
            throw new RuntimeException("链表为空");
        }
        while (n>0){
            if(head.next==null){
                System.out.println("数字大于链表长度");
                return null;
            }
            head = head.next;
            n--;
        }
        Node p = new Node(0);
        p=node;
        while(head.next!=null){
            head = head.next;
            p = p.next;
        }
        return p.next;
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;

        System.out.println(find(2,n1).value);
    }


}

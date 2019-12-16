package com.ln.question13;

public class DeleteNode {
    public static Node delete(Node node,int target){
        Node p=new Node(0);
        Node head;
        head = node ;
        Node newHead = new Node();
        newHead = node;
        p.next=head;
        boolean flag = true;
        if(node==null){
            System.out.println("链表为空");
            return null;
        }
        if(head.value==target){
            if(head.next!=null){
                newHead=head.next;
            }else if(head.next==null){
                return null;
            }
        }
        while(head.next!=null){
            if(head.value==target&&head.next!=null){
                p.next=head.next;
                head=p.next;
                flag=false;
            }else {p=p.next;
                head=head.next;
            }

        }
        if(flag){
            System.out.println("该节点不存在");
            return null;
        }
        if(head.value==target){
            p.next=null;
        }
        return newHead;
    }


    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(3);
        Node n5 = new Node(3);

        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        Node afterDelete = delete(n1,0);
        while (afterDelete!=null){
            System.out.println(afterDelete.getValue());
            afterDelete = afterDelete.next;
        }
    }
}

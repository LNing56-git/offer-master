package com.ln.question17;

import org.omg.CORBA.NO_IMPLEMENT;

/**
 * @author lining
 * @since 2019/9/19
 */
public class Merge {
    public static Node merge(Node n1,Node n2){
//            int length = Leng(n1)+Leng(n2);
            Node mer = new Node();
            Node temp = mer;
            while (n1!=null&&n2!=null){
                if(n1.value>n2.value){
                    mer.next=n2;
                    n2= n2.next;
                    mer = mer.next;
                }else if(n1.value==n2.value){
                        mer.next=n2;
                    n2= n2.next;
                    mer = mer.next;
                }else {
                        mer.next=n1;
                        n1 = n1.next;
                        mer= mer.next;
                }
            }
            if(n1!=null){
                mer.next=n1;
            }else if(n2!=null){
                mer.next=n2;
            }
            return temp.next;
    }
//    public int Leng(Node node){
//        int length=0;
//        while (node.next!=null){
//            length++;
//            node=node.next;
//        }
//        return length;
//    }
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        n1.next=n2;
        n2.next=n3;
        Node N1 = new Node(2);
        Node N2 = new Node(3);
        N1.next=N2;
        Node me = merge(n1,N1);
        while(me!=null){
            System.out.println(me.value);
            me = me.next;
        }


    }
}

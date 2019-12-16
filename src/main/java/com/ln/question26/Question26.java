package com.ln.question26;

public class Question26 {
//    public static ListNode ComplexListNodeClone(ListNode root){
//            ListNode temp = new ListNode(),head;
//            while(root!=null){
//                temp.value=root.value;
//                temp.next=root.next;
//                temp.sibling=root.sibling;
//
//
//            }
//            return head;
//    }
    public static void main(String[] args) {
            ListNode l1 = new ListNode(1);
            ListNode l2 = new ListNode(2);
            ListNode l3 = new ListNode(3);
            l1.next=l2;
            l2.next=l3;
//            ListNode rs = ComplexListNodeClone(l1);
////            while(rs!=null){
////                System.out.println(rs.value);
////                rs=rs.next;
////            }
    }
}

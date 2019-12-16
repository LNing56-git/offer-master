package com.LeetCode;

public class LC_21 {
//    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//
//        ListNode prehead = new ListNode(-1);
//        ListNode pre =prehead;
//        while (l2!=null&&l1!=null){
//            if(l2.val<=l1.val){
//                pre.next = l2;
//                l2=l2.next;
//            }else {
//                pre.next = l1;
//                l1 = l1.next;
//            }
//            pre= pre.next ;
//         }
//        pre.next= l1==null?l2:l1;
//        return prehead.next;
//    }
    public ListNode mergeTwoLists(ListNode l1,ListNode l2){
        if(l1==null){
            return l1;
        }else if(l2==null){
            return l2;
        }else if(l1.val<l2.val){
            l1.next = mergeTwoLists(l1.next,l2);
            return l1;
        }else {
            l2.next = mergeTwoLists(l1,l2.next);
            return l2;
        }
    }
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(4);
        ListNode O1 = new ListNode(1);
        ListNode O2 = new ListNode(2);
        ListNode O3 = new ListNode(4);
      //
        //  ListNode O4 = new ListNode(4);
        n1.next=n2;
        n2.next=n3;
        O1.next=O2;
        O2.next=O3;

        System.out.println(new LC_21().mergeTwoLists(n1,O1));



    }
}

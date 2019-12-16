package com.LeetCode;

public class LC_19 {
//    public ListNode removeNthFromEnd(ListNode head, int n) {
//        ListNode dumy = new ListNode(0);
//        dumy.next = head;
//        int length = 0;
//        ListNode H = head;
//        ListNode h2 = head;
//        while(head!=null){
//            length++;
//            head=head.next;
//        }
//        length -= n;
//        h2 = dumy;
//        while (length>0){
//            length--;
//            h2=h2.next;
//        }
//        h2.next = h2.next.next;
//        return  dumy.next;
//    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode f1;
        ListNode f2 ;
        ListNode yum =  new ListNode(0);
        f2 = yum;
        f1 =yum;
        yum.next = head;
        for (int i=0;i<n+1;i++){
            f1 = f1.next;
        }
        while (f1!=null){
            f1 = f1.next;
            f2 = f2.next;
        }
        f2.next = f2.next.next;
        return  yum.next;
    }

}

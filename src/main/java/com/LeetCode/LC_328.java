package com.LeetCode;

public class LC_328 {
    public ListNode oddEvenList(ListNode head) {
        ListNode odd = head;
        if(head==null||head.next==null)return head;
        ListNode even = head.next;
        ListNode evenhead = even;
        while (even!=null&&even.next!=null){
            odd.next = odd.next.next;
            odd = odd.next;
            even.next = even.next.next;
            even = even.next;
        }
        odd.next = evenhead;
        return  head;
    }
}

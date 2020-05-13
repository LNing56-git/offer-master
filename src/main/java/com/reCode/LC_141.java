package com.reCode;

public class LC_141 {
    public boolean hasCycle(ListNode head) {
        if (head==null){
            return false;
        }
        ListNode quick = head.next;
        ListNode slow = head;
        while (quick!=null&&slow!=null&&quick.next!=null){
            if (quick==slow){
                return true;
            }
            quick = quick.next.next;
            slow = slow.next;
        }
        return false;
    }
}

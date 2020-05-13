package com.JianZhiOffer;

import com.LeetCode.ListNode;

public class FindKthToTail {
    public ListNode FindKthToTail(ListNode head, int k) {
        if (head==null||k<0){
            return head;
        }
        ListNode quick = head;
        ListNode slow = head;
        for (int i =0;i<k-1;i++){
            if (quick.next!=null){
                quick = quick.next;
            }else {
                return null;
            }
        }

        while (quick.next!=null){
            quick=quick.next;
            slow = slow.next;
        }
        return slow;
    }
}

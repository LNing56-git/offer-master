package com.JianZhiOffer;

import com.LeetCode.ListNode;

public class ReverseList {
    public ListNode ReverseList(ListNode head) {
        if (head==null||head.next==null){
            return head;
        }
        ListNode pre = null;
        ListNode cur = head;
        while (cur!=null){
            ListNode next = cur.next;
            cur.next = pre;
            if (next==null){
                return cur;
            }
            pre = cur;
            cur = next;
        }
        return cur;

    }
}

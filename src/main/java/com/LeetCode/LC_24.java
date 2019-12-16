package com.LeetCode;

public class LC_24 {
    public ListNode swapPairs(ListNode head) {
            ListNode yum = new ListNode(0);
            yum.next = head;
            ListNode pre = yum;
            while (pre.next!=null&&pre.next.next!=null){
                ListNode l1 = pre.next;
                ListNode l2 = pre.next.next;
                ListNode next = l2.next;
                l1.next = next;
                l2.next = l1;
                pre.next = l2;
                pre =l1;
            }
            return yum.next;
    }

    public static void main(String[] args) {

    }
}

package com.LeetCode;

public class LC_83 {
    public ListNode deleteDuplicates(ListNode head) {
            ListNode He = head;
            while (head!=null&&head.next!=null){
                if (head.val==head.next.val){
                    head.next=head.next.next;
                }else {
                    head=head.next;
                }
            }
            return He;
    }
}

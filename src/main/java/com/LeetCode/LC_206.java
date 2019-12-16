package com.LeetCode;

public class LC_206 {
//    public ListNode reverseList(ListNode head) {
//            ListNode pre = null;
//            ListNode cur = head;
//            while (cur!=null){
//                ListNode temp = cur.next;
//                cur.next = pre;
//                pre = cur;
//                cur = temp;
//            }
//            return pre;
//    }
    public ListNode reverseList(ListNode head){
        if(head.next==null||head.next.next==null){
            return head;
        }
        ListNode p = reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return p;
    }
    public static void main(String[] args) {

    }
}

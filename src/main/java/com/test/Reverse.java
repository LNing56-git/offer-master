package com.test;

import com.LeetCode.ListNode;

public class Reverse {
    public static ListNode res(ListNode root){
        if(root==null)return null;
        if(root.next==null)return root;
        ListNode cur = root;
        ListNode next = root.next;
        ListNode head = null;
        ListNode pre = null;
        while (cur!=null){
            next = cur.next;
            if(next==null)head = cur;
            cur.next=pre;
            pre = cur;
            cur = next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        n1.next=n2;
        n2.next=n3;
        ListNode re = res(n1);
        while (re!=null){
            System.out.println(re.val);
            re = re.next;
        }
    }
}

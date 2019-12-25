package com.LeetCode;

import java.util.Stack;

public class LC_109 {
    public TreeNode sortedListToBST(ListNode head) {
        if (head==null)return null;
        if (head.next==null)return new TreeNode(head.val);
        ListNode pre = convert(head);
        ListNode mid = pre.next;
        pre.next=null;
        TreeNode node = new TreeNode(mid.val);
        node.left = sortedListToBST(head);
        node.right = sortedListToBST(mid.next);
        return node;
    }
    public ListNode convert(ListNode head){
        ListNode q = head;
        ListNode s = head;
        ListNode t = q;
        while (s!=null&&s.next!=null){
            t = q;
            q=q.next;
            s=s.next.next;
        }
        return t;
    }
    public static void main(String[] args) {

    }
}

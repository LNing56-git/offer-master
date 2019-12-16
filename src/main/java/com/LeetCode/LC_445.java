package com.LeetCode;

import java.util.Stack;

public class LC_445 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<ListNode> s1 = new Stack<>();
        Stack<ListNode> s2 = new Stack<>();
        int a =0;
        int b = 0;
        while (l1!=null){
            s1.push(l1);
            l1=l1.next;
        }
        while (l2!=null){
            s2.push(l2);
            l2 = l2.next;
        }
        int carr=0;
        ListNode head = new ListNode(-1);
        while(s1.size()!=0||s2.size()!=0||carr!=0) {
            int x = s1.isEmpty()?0:s1.pop().val;
            int y = s2.isEmpty()?0:s2.pop().val;
            int sum= x+y+carr;
            ListNode node = new ListNode(sum%10);
            carr = sum/10;
            node.next = head.next;
            head.next = node;
        }
        return  head.next;
    }
    public static void main(String[] args) {

    }
}

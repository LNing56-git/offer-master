package com.JianZhiOffer;

import com.LeetCode.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class printListFromTailToHead {
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ListNode head = listNode;
        ListNode result = null;
        ListNode cur = null;
        ArrayList<Integer> list = new ArrayList<>();
        if (listNode==null){
            return list;
        }
        if (listNode.next==null){
            list.add(listNode.val);
            return list;
        }
        while (head!=null){
            ListNode next = head.next;
            if (next==null){
                result=head;
            }
            head.next = cur;
            cur = head;
            head = next;
        }
        while (result!=null){
            list.add(result.val);
            result=result.next;
        }
        return list;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        l1.next=l2;
        l2.next=l3;
        List<Integer> list = printListFromTailToHead(l1);
        for ( int num:list){
            System.out.println(num);
        }

    }
}

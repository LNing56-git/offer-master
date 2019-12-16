package com.LeetCode;

import java.util.HashSet;

public class LC_141 {
    public boolean hasCycle(ListNode head) {
  //      ListNode fast = head,low = head;
        HashSet<ListNode> set = new HashSet<>();
        while (head!=null){
            if(set.contains(head)){
                return true;
            }else {
                set.add(head);
                head=head.next;
            }
        }
        return false;
//        while (fast!=null&&fast.next!=null){
//            fast = fast.next.next;
//            low = low.next;
//            if(fast==low){
//                return true;
//            }
//        }
/**        if(head==null||head.next==null||head.next.next==null){
            return false;
        }
        while(true){
            fast = fast.next.next;
            low = low.next;
            if(fast==null&&fast.next==null){
                return false;
            }
            if(fast==low){
                return true;
            }

        }
       // return false;*/
}

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        LC_141 lc_141 = new LC_141();
        System.out.println(lc_141.hasCycle(l1));
    }
}




package com.LeetCode;

public class LC_725 {
    public ListNode[] splitListToParts(ListNode root, int k) {
        int n=0;
        ListNode head = root;
        ListNode[] re = new ListNode[k];
        while (head!=null){
            n++;
            head=head.next;
        }
        if(n<=k){
            int i=0;
            ListNode h1 = root;
            while (h1!=null){
                re[i++]=new ListNode(h1.val);
                h1=h1.next;
            }
        }else {
            int g = n/k;
            int y = n%k;
            int[]num = new int[k];
            int b=0;
            ListNode pre = new ListNode(-1);
            pre=root;
            for(int i =0;i<k;i++){
                b=(y-->0)?g+1:g;
                re[i]=pre;
                for(int j=0;j<b-1;j++){
                    pre=pre.next;
                }
                ListNode next = pre.next;
                pre.next=null;
                pre=next;

            }
        }
        return re;
    }
    public static void main(String[] args) {

    }
}

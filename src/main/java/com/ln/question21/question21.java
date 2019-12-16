package com.ln.question21;

/**
 * @author lining
 * @since 2019/9/25
 * 通过链表定义一个栈的数据结构，自定义栈的最小值方法min()出栈pop()入栈方法push（）
 *
 */
public class question21 {
    Node head = new Node(0);
    Node su = new Node(0);

    public Node push (int value){
        Node node = new Node(value);
        node.next=head.next;
        head.next=node;
        if(su.next==null||value<su.next.value){
            Node temp = new Node(value);
            temp.next = su.next;
            su.next=temp;
        }
        return head.next;
    }
    public Node pop() throws Exception {
        if(head.next==null){
            throw new Exception("栈为空无法出栈");
        }
        Node temp = head.next;
        head.next=head.next.next;
        if(temp.value==su.next.value){
            su.next=su.next.next;
        }
        return head.next;
    }
    public int min()throws Exception{
        if(head.next==null){
            throw new Exception("栈为空！无最小值");
        }
        return  su.next.value;
    }
    public static void main(String[] args) throws Exception {
        question21 q21 = new question21();
        q21.push(3);
        q21.push(2);
        q21.push(4);
        q21.push(1);
        q21.push(0);
        System.out.println(q21.min());
        q21.pop();
        System.out.println(q21.min());
        q21.pop();
        System.out.println(q21.min());
        q21.pop();
        System.out.println(q21.min());
    }

}

package com.ln.question07;

import java.util.Stack;

/**
 * @author lining
 * @since 2019/9/5
 * @param <T>
 */
public class Queue<T> {
    Stack<T> stack1 = new Stack<>();
    Stack<T> stack2 = new Stack<>();
    public void appendTail(T insertParam){
        stack1.push(insertParam);
        System.out.println(stack1);
    }
    public void deleteHead(){
        if(stack1.empty()){
            System.out.println("队列为空无法删除节点");
            return;
        }
        while(!stack1.empty()){
            stack2.push(stack1.peek());
            stack1.pop();
        }
        stack2.pop();
        while(!stack2.empty()){
            stack1.push(stack2.peek());
            stack2.pop();
        }
        System.out.println(stack1);
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.appendTail(1);
        queue.appendTail(2);
        queue.appendTail(3);
        queue.deleteHead();
    }
}

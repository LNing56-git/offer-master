package com.LeetCode;

import java.util.Stack;

public class MyQueue {
    Stack<Integer> stack;
    /** Initialize your data structure here. */
    public MyQueue() {
        this.stack = new Stack<Integer>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stack.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        Stack<Integer> temp = new Stack<>();
        int t=0;
        while (stack.size()!=0){
           t = stack.pop();
            temp.push(t);
        }
        int k = temp.pop();
        while (temp.size()!=0){
            t = temp.pop();
            stack.push(t);
        }
        return k;
    }
    /** Get the front element. */
    public int peek() {
        Stack<Integer> temp = new Stack<>();
        int t=0;
        while (stack.size()!=0){
            t = stack.pop();
            temp.push(t);
        }
        int k = temp.peek();
        while (temp.size()!=0){
            t = temp.pop();
            stack.push(t);
        }
        return k;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return this.stack.isEmpty();
    }
}

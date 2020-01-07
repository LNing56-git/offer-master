package com.LeetCode;


import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    Queue<Integer> queue;
    /** Initialize your data structure here. */
    public MyStack() {
        this.queue = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        queue.add(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        int length = this.queue.size();
        while (length-->1){
            int temp = queue.remove();
            queue.add(temp);
        }
        int res = queue.remove();
        return res;
    }

    /** Get the top element. */
    public int top() {
        int length = this.queue.size();
        while (length-->1){
            int temp = queue.remove();
            queue.add(temp);
        }
        int res = queue.remove();
        queue.add(res);
        return res;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }
}

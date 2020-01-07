package com.LeetCode;


import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class  MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack ;
    /** initialize your data structure here. */
    public MinStack() {
        this.stack=  new Stack<>();
        minStack = new Stack<>();
        minStack.push(Integer.MAX_VALUE);
    }
    public void push(int x) {
        if (x<=minStack.peek())minStack.push(x);
        stack.push(x);
    }

    public void pop() {
        int x = stack.pop();
        if(x==minStack.peek()||stack.size()==0)minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}

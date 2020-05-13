package com.JianZhiOffer;

import java.util.Stack;

public class StackToQueue {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        while (stack1.size()!=0){
            int temp = stack1.pop();
            stack2.push(temp);
        }
        int result = stack2.pop();
        while (stack2.size()!=0){
            int temp = stack2.pop();
            stack1.push(temp);
        }
        return result;
    }
}

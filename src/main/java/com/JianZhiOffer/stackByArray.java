package com.JianZhiOffer;

import com.single.Holder;

import java.util.ArrayList;
import java.util.Stack;

public class stackByArray {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> stack1 = new Stack<>();

    public void push(int node) {
        stack.push(node);
        if (stack1.size()==0||node<stack1.peek()){
            stack1.push(node);
        }
    }

    public void pop() {
        int  temp = stack.pop();
        if (temp==stack1.peek()){
            stack1.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return stack1.peek();
    }
}

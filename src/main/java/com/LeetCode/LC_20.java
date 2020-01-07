package com.LeetCode;

import java.util.Stack;

public class LC_20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int length = s.length();
        for (int i=0;i<length;i++){
            char ch = s.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
                stack.push(ch);
            } else if (stack.isEmpty()) {
                return false;
            } else {
                if (ch == ')') {
                    if (stack.peek() == '(') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
                if (ch == '}') {
                    if (stack.peek() == '{') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
                if (ch == ']') {
                    if (stack.peek() == '[') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }

        }
        if (stack.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
}

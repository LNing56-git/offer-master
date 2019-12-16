package com.ln.question22;

import java.util.Stack;

public class question23 {

    public boolean IsPopOrder(char[] push,char[] pop) {
        if (pop.length != push.length) {
            return false;
        }
        Stack<Character> stack = new Stack();
        int length = push.length;
        int flag = 0;
        int popFlag = 0;
        boolean Flag = true;
        while (popFlag != length) {
            if (push[flag] == pop[popFlag]) {
                flag++;
                popFlag++;
                if (flag == length) flag--;
                continue;
            }
            if (stack.size() != 0) {
                if (pop[popFlag] == stack.peek()) {
                    popFlag++;
                    stack.pop();
                    continue;
                }}
            if (flag != length - 1) {
                stack.push(push[flag]);
                flag++;
                continue;
            }
            return false;
        }
        if (stack.empty()) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        char[] push={'1','2','3','4','5'};
        char[] pop={'4','5','3','2','1'};
        char[] pop1={'4','3','5','1','2'};
        question23 question23 = new question23();
        System.out.println(question23.IsPopOrder(push,pop));
    }
}

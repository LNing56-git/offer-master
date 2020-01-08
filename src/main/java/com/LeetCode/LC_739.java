package com.LeetCode;

import java.util.Stack;

/**
 * s数组中元素与下一个比它大的元素之间的距离
 */
public class LC_739 {
    public int[] dailyTemperatures(int[] T) {
        int[] res = new int[T.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = T.length-1;i>=0;i--){
            while (!stack.isEmpty()&&T[i]>=T[stack.peek()]){
                stack.pop();
            }
            if (stack.isEmpty()){
                res[i]=0;
            }else {
                res[i]=stack.peek()-i;
            }
            stack.add(i);

        }
        return res;
    }
}

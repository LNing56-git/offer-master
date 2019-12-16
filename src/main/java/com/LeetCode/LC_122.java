package com.LeetCode;

public class LC_122 {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n<=1){
            return 0;
        }
        int maxprofit = 0;
        for(int i=1;i<n;i++){
            if(prices[i]>prices[i-1]){
                maxprofit+=prices[i]-prices[i-1];
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int[]a ={1,9,6,9,1,7,1,1,5,9,9,9};
        System.out.println(new LC_122().maxProfit(a));
    }
}

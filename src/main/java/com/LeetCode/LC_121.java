package com.LeetCode;

import org.apache.commons.math3.analysis.function.Max;

public class LC_121 {
//    public int maxProfit(int[] prices) {
//        int maxprofit=-1;
//        for(int i=0;i<prices.length-1;i++){
//            for(int j= i+1;j<prices.length;j++){
//                int sum = prices[j]-prices[i];
//                if(sum>maxprofit){
//                    maxprofit = sum;
//                }
//            }
//        }
//        return maxprofit>0?maxprofit:0;
//    }
    public int maxProfit (int[] prices){
        int n = prices.length;
        if(n==0)return 0;
        int min= prices[0];
        int maxprofit = 0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min = prices[i];
                continue;
            }else {
                int sub = prices[i]-min;
                if(sub>maxprofit){
                    maxprofit = sub;
                }
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int[] a = {7,6,4,3,1};
        System.out.println(new LC_121().maxProfit(null));
    }
}

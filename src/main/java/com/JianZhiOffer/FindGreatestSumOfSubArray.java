package com.JianZhiOffer;

public class FindGreatestSumOfSubArray {
    public static int FindGreatestSumOfSubArray(int[] array) {
        int max = array[0];
        //因为这个dp[i]老是变，所以比如你dp[4]是8 dp[5]就变成-7了，所以需要res保存一下
        int res = array[0];
        for (int i = 1; i < array.length; i++) {
            res = Math.max(res + array[i], array[i]);
            max = Math.max(res, max);
        }
        return max;

    }

    public static void main(String[] args) {
        int []a = {6,-3,-2,7,-15,1,2,2};
        FindGreatestSumOfSubArray(a);
    }
}

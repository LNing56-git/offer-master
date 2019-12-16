package com.LeetCode;

public class LC_167 {
    public int[] twoSum(int[] numbers,int target){
        int i=0,j=numbers.length-1;
        int sum;
        sum = numbers[i]+numbers[j];
        while (sum!=target){
            if(sum<target){
                i++;
            }
            sum = numbers[i]+numbers[j];
            if(sum==target){
                break;
            }
            if(sum>target){
                j--;
            }
            sum = numbers[i]+numbers[j];
        }
        int[] result = {i+1,j+1};
        return result;
    }

    public static void main(String[] args) {
        LC_167 lc_167 = new LC_167();
    }
}

package com.reCode;

public class LC_167 {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length-1;

        while (i<j){
            if (numbers[i]+numbers[j]==target){
                break;
            }
            while (numbers[i]+numbers[j]>target){
                j--;
            }
            while (numbers[i]+numbers[j]<target){
                i++;
            }
        }
        int[] result = new int[2];
        result[0]=i+1;
        result[1]=j+1;
        return result;
    }
}

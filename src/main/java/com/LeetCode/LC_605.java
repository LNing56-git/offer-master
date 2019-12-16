package com.LeetCode;

public class LC_605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i=0,count = 0;
        while(i<flowerbed.length) {
            if(flowerbed[i]==0&&(i==0||flowerbed[i-1]==0)&&(i==flowerbed.length-1||flowerbed[i+1]==0)){
                    count++;
                    flowerbed[i++]=1;
            }
            if(count>=n){
                return true;
            }
            i++;
        }
        return false;
    }
    public boolean canPlaceFlowers1(int[] flowerbed, int n) {
        int i = 0, count = 0;
        while (i < flowerbed.length) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i++] = 1;
                count++;
            }
            if(count>=n)
                return true;
            i++;
        }
        return false;
    }

    public static void main(String[] args) {
            int[]a={1,0,0,0,1,0,0};
        System.out.println(new LC_605().canPlaceFlowers(a,2));
    }
}

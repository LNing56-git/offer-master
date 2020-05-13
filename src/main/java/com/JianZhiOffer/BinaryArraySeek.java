package com.JianZhiOffer;

public class BinaryArraySeek {
    public boolean Find(int target, int [][] array) {
        int l = array[0].length;
        int m = array.length;
        int x = 0;
        int y = l-1;
        while (x<m&&y>=0){
            if (array[x][y]==target){
                return true;
            }
            else if (target<array[x][y]){
                y--;
            }else {
                x++;
            }
        }
        return false;
    }
}

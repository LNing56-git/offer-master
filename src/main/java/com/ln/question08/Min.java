package com.ln.question08;
/**
 * @title 旋转数组最小的数字
 * @author lining
 * @since 2019/9/10
 * @Description 第一种情况  456123 通过二分法寻找最小值  第二种11111111（10111） 通过遍历寻找
 */
public class Min {
    public int searchMinRotateArrays(int target[]){
        int right = target.length-1;
        int left = 0;
        int mid = 0;
        while(right-left>=1){
                mid = (left + right)/2;
                if(right - left == 1){
                    mid = right;
                    break;
                }
                if(target[left]==target[mid]&&target[mid]==target[right]){
                        return min(target);
                }
                if(target[left]<=target[mid]){
                    left = mid;
                }else if(target[right]>=target[mid]){
                    right = mid;
                }
            }
        return target[mid];
    }
    public int min(int target[]){
        int min=target[0];
        for(int i=0;i<target.length;i++){
            if(target[i]<min){
                min = target[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
    //    int a[]={1,2,3,4,5,6};
        int b[]={1,0,1,1,1};
        int c[]={4,5,6,1,2,3};
        Min min = new Min();
     //  System.out.println(min.searchMinRotateArrays(a));
        System.out.println(min.searchMinRotateArrays(b));
        System.out.println(min.searchMinRotateArrays(c));
    }
}


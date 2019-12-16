package com.LeetCode;

import java.util.HashMap;

public class LC_75 {
//    public static void sortColors(int[] nums) {
//        if(nums.length==0||nums.length==1){
//                return;
//        }
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int num:nums){
//            map.put(num,map.getOrDefault(num,0)+1);
//        }
//        int j = 0;
//        int n = 0;
//        for(int i = 0;i<3;i++){
//            if(!map.containsKey(i)){
//                continue;
//            }
//            n = map.get(i);
//            while (n--!=0){
//                nums[j]=i;
//                if(j<nums.length-1){
//                    j++;
//                }
//            }
//        }
//
//    }
public  void sortColors(int[] nums) {
    int p0=0,c1=0,p2=nums.length-1;
    int temp=0;
    while (c1<=p2){
        if(nums[c1]==0){
            temp=nums[c1];
            nums[c1]=nums[p0];
            nums[p0]=temp;
            c1++;
            p0++;
        }else if(nums[c1]==2){
            temp=nums[c1];
            nums[c1]=nums[p2];
            nums[p2]=temp;
            p2--;
        }else {
            c1++;
        }
    }
}
public void exchange(int a,int b){
    int temp=0;
    temp = a;
    a = b;
    b = temp;

}

    public static void main(String[] args) {
            int[] a = {2,0,1};
             new LC_75().sortColors(a);
            for(int b : a){
                System.out.print(b+" ");

            }
    }
}

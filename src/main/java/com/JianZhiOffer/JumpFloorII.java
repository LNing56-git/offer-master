package com.JianZhiOffer;

public class JumpFloorII {
    public int JumpFloorII(int target) {


        /**
         * 递归
         */
        if(target==1||target==0||target==2){
            return target;
        }
        int sum = 0;
        for (int i = 1;i<target;i++){
            sum+=JumpFloorII(i);
        }
        return sum+1;


        /**
         * 非递归
         */
//        if (target==0||target==1||target==2){
//            return target;
//        }
//        int[] res = new int[target+1];
//        res[1]=1;
//        res[2]=2;
//        for (int i=3;i<=target;i++){
//            int sum=0;
//            for (int j=1;j<i;j++){
//                sum+=res[j];
//            }
//            res[i]=sum+1;
//        }
//        return res[target];
    }

}

package com.LeetCode;

public class LC_164 {

    public class tong{
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
    }

    public int maximumGap(int[] nums) {
        if(nums==null&&nums.length<2){
            return 0;
        }
        int len = nums.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num:nums){
            min = Math.min(min,num);
            max = Math.max(max,num);
        }
        //分配桶的长度和个数是桶排序的关键
        //在n个数下，形成的两两相邻区间是N-1个，比如[2,4,6,8]
        //有4个数，但是只有3个区间，[2,4],[4,6],[6,8]
        //因此，桶长度 = 区间总长度 / 区间总个数 = (max - min)/(nums.length-1)
        int bucketSize = Math.max(1,(max-min)/(len-1));
        //桶的个数 = 区间长度 / 桶长度
        //因为整数除不尽所以  桶的个数要加1
        tong[] tongs = new tong[(max-min)/bucketSize+1];

        //把数组上的各个数全放桶里面（最大值和最小值）
        for (int i = 0;i<nums.length;i++){
            int loc = (nums[i]-min)/bucketSize;
            if (tongs[loc]==null){
                tongs[loc] = new tong();
            }
            tongs[loc].max=Math.max(tongs[loc].max,nums[i]);
            tongs[loc].min=Math.min(tongs[loc].min,nums[i]);
        }
        int previousMax = Integer.MAX_VALUE;
        int maxGap = Integer.MIN_VALUE;
        for (int i = 0;i<tongs.length;i++){
            if (tongs[i]!=null&&previousMax!=Integer.MAX_VALUE){
                    maxGap = Math.max(maxGap,tongs[i].min-previousMax);
            }
            if (tongs[i]!=null){
                    previousMax = tongs[i].max;
                    maxGap = Math.max(maxGap,tongs[i].max-tongs[i].min);
            }
        }
        return maxGap;
    }
}

//package com.LeetCode;
//
//public class LC_278 {
//    public int firstBadVersion(int n) {
//        int mid ;
//        int R = n;
//        int L = 1;
//        while (L<R){
//            mid = L-(L-R)/2;
//            if(isBadVersion(mid)){
//                R = mid;
//            }else {
//                L = mid+1;
//            }
//        }
//        return (int)L;
//    }
//}

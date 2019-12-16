package com.LeetCode;

import java.util.*;

public class LC_347 {
//    public static void test(){
//        HashMap<Integer,Integer> map = new HashMap<>();
//        map.put(1,2);
//        int a = map.getOrDefault(1,0);
//        map.put(1,map.getOrDefault(1,0)+1);
//        int b = map.getOrDefault(1,0);
//        map.put(2,map.getOrDefault(2,0)+1);
//        System.out.println("b"+b);
//        System.out.println(map.get(1));
//        System.out.println(map.get(2));
//        System.out.println(map);
//        System.out.println(map.keySet());
//    }

    /**
     * 利用hashmap和优先队列
     * @param nums
     * @param k
     * @return
     */
//    public List<Integer> topKFrequent(int[] nums, int k) {
//            HashMap<Integer,Integer> count = new HashMap();
//            for(int num:nums){
//                count.put(num,count.getOrDefault(num,0)+1);
//            }
//            PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
//                @Override
//                public int compare(Integer o1, Integer o2) {
//                    return count.get(o1)-count.get(o2);
//                }
//            });
//            for(Integer s:count.keySet()){
//                if(queue.size()<k){
//                    queue.add(s);
//                }else {
//                    if(count.get(s)>count.get(queue.peek())){
//                            queue.remove();
//                            queue.add(s);
//                    }
//                }
//            }
//            List<Integer> list = new ArrayList<>();
//            while (!queue.isEmpty()){
//                list.add(queue.remove());
//
//            }
//            return list;
//    }

    /**
     * 桶排序
     * @param nums
     * @param k
     * @return
     */
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> count = new HashMap<>();
        for( int num:nums){
            count.put(num,count.getOrDefault(num,0)+1);
        }
        List<Integer>[] list = new ArrayList[nums.length+1];
        for(int s:count.keySet()){
            if(list[count.get(s)]==null){
                list[count.get(s)] = new ArrayList<>();
            }
            list[count.get(s)].add(s);
        }
        List<Integer> res = new ArrayList<>();
        for(int i=nums.length;res.size()<k;i--){
            if(list[i]==null){
                continue;
            }
            if(list[i].size()<k-res.size()){
                res.addAll(list[i]);
            }else {
                res.addAll(list[i].subList(0,k-res.size()));
            }
        }
        return res;
    }

    public static void main(String[] args) {

    }
}

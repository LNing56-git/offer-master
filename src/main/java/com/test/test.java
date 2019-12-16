package com.test;


import java.util.*;

public class test{


    public void test(){
        Integer [] a ={1,2,3};
        Arrays.sort(a, (Integer o1,Integer o2)->{return o2-o1;});
       for (int i=0;i<a.length;i++){
           System.out.println(a[i]);
       }


    }
    public  static int sum(TreeNode root){
        if(root==null){
            return 0;
        }
        int left = sum(root.left);
        int right = sum(root.right);
        return  root.val+left+right;

    }



    public static void main(String[] args) {
//        Queue list= new PriorityQueue<Integer>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2-o1;
//            }
//        });
//        int[]a={1,5,3,7,8,3,5};
//        for(int t:a){
//            list.add(t);
//            if(list.size()>2){
//                list.poll();
//            }
//        }
//        for(Object t:list){
//            System.out.println((int)t);
//        }
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(1);
        TreeNode t3 = new TreeNode(1);
        t1.left=t2;
        t1.right=t3;
        System.out.println(sum(t1));

    }
}

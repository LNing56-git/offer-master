package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LC_241 {
//    public List<Integer> diffWaysToCompute(String input) {
//         return    partition(input);
//    }
//    public List<Integer> partition(String string){
//        List<Integer> list = new ArrayList<>();
//        if(!string.contains("+")&&!string.contains("-")&&!string.contains("*")){
//            list.add(Integer.valueOf(string));
//            return list;
//        }
//        int length = string.length();
//
//        for (int i=0;i<length;i++){
//            if("+".equals(string.charAt(i))||"-".equals(string.charAt(i))||"*".equals(string.charAt(i))){
//            for (Integer left:partition(string.substring(0,i))){
//                for (Integer right:partition(string.substring(i+1))){
//                    if("+".equals(string.charAt(i))){
//                        list.add(left+right);
//                    }else if ("-".equals(string.charAt(i))){
//                        list.add(left-right);
//                    }else if("*".equals(string.charAt(i))){
//                        list.add(left*right);
//                    }
//                }
//            }
//        }}
//        return list;
////    }
//public List<Integer> diffWaysToCompute(String input) {
//    List<Integer> ways = new ArrayList<>();
//    for (int i = 0; i < input.length(); i++) {
//        char c = input.charAt(i);
//        if (c == '+' || c == '-' || c == '*') {
//            List<Integer> left = diffWaysToCompute(input.substring(0, i));
//            List<Integer> right = diffWaysToCompute(input.substring(i + 1));
//            for (int l : left) {
//                for (int r : right) {
//                    switch (c) {
//                        case '+':
//                            ways.add(l + r);
//                            break;
//                        case '-':
//                            ways.add(l - r);
//                            break;
//                        case '*':
//                            ways.add(l * r);
//                            break;
//                    }
//                }
//            }
//        }
//    }
//    if (ways.size() == 0) {
//        ways.add(Integer.valueOf(input));
//    }
//    return ways;
//}
    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<input.length();i++){
            char c =input.charAt(i);
            if(c=='+'||c=='-'||c=='*'){
                List<Integer> left = diffWaysToCompute(input.substring(0,i)) ;
                List<Integer> right = diffWaysToCompute(input.substring(i+1));
                for(Integer a:left){
                    for (Integer b:right){
                        switch (c){
                            case '+':list.add(a+b);break;
                            case '-':list.add(a-b);break;
                            case '*':list.add(a*b);break;
                        }
                    }
                }
            }
        }
        if(list.size()==0){
            list.add(Integer.valueOf(input));
        }
        return list;
    }
    public static void main(String[] args) {
        String a ="1+2+3";
        List<Integer> result = new LC_241().diffWaysToCompute(a);
        for(int s:result){
            System.out.println(s);
        }
    }
}

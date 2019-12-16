package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LC_524 {
    
    public String findLongestWord(String s, List<String> d) {
        if(s==null||d.size()==0){
                 return "";
        }
        char[] sstr = s.toCharArray();
        int maxnum = 0,flag=0,result=0;
        for(String A :d){

            int num=0;
            char[] dstr = A.toCharArray();
            if(dstr.length>sstr.length){
                continue;
            }
            int i=0,j=0;
            while(i<sstr.length){
                if(sstr[i]==dstr[j]){
                    i++;
                    j++;
                    num++;
                }else {
                    i++;
                }
                if(j==dstr.length){
                    if(num>maxnum){
                        maxnum = num;
                        result = flag;
                    }else if(num==maxnum){
                        if(String.valueOf(dstr).compareTo(d.get(result))<0){
                            maxnum = num;
                            result = flag;
                        }
                    }
                    break;
                }
            }
            flag++;
        }
        if(maxnum==0){
            return "";
        }else         return d.get(result);

    }










//    public String findLongestWord(String s, List<String> d) {
//        String longestWord = "";
//        for (String target : d) {
//            int l1 = longestWord.length(), l2 = target.length();
//            if (l1 > l2 || (l1 == l2 && longestWord.compareTo(target) < 0)) {
//                continue;
//            }
//            if (isSubstr(s, target)) {
//                longestWord = target;
//            }
//        }
//        return longestWord;
//    }
//
//    private boolean isSubstr(String s, String target) {
//        int i = 0, j = 0;
//        while (i < s.length() && j < target.length()) {
//            if (s.charAt(i) == target.charAt(j)) {
//                j++;
//            }
//            i++;
//        }
//        return j == target.length();
//    }



    public static void main(String[] args) {
            LC_524 lc_524 = new LC_524();
            List<String> list = new ArrayList<>();
            list.add("ba");
            list.add("ab");
            list.add("a");
            list.add("b");
            System.out.println(lc_524.findLongestWord("bab",list));
    }
}

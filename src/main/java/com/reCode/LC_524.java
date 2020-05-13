package com.reCode;

import java.util.List;

public class LC_524 {
    public String findLongestWord(String s, List<String> d) {
        if (s.length()==0){
                return "";
        }
        int max = 0;
        String  result="" ;
        for (String target:d){
            if (isSubString(s,target)){
                if (target.length()>=max){
                    max = target.length();
                    result = target;
                }
            }
        }
        return result;
    }
    public boolean isSubString(String s,String target){
        int i = 0, j =0;
        while (i<s.length()&&j<target.length()){
            if (s.charAt(i)==target.charAt(j)){
                j++;
            }
            i++;
        }
        return j==target.length();
    }
}

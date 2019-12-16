package com.LeetCode;

public class LC_744 {

    public char nextGreatestLetter(char[] letters, char target) {
        boolean[] temp = new boolean[26];
        for (char a:letters){
            temp[a-'a']=true;
        }
        while(true){
            target++;
            if(target>'z')target='a';
            if(temp[target-'a']){
                return target;
            }
        }
    }
    public static void main(String[] args) {

    }
}

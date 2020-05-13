package com.reCode;

import java.util.Arrays;
import java.util.HashSet;

public class LC_345 {
    public String reverseVowels(String s) {
        HashSet<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        char[] temp = new char[s.length()];
        temp = s.toCharArray();
        int i = 0;
        int j = s.length()-1;
        while (i<j){
            while (!vowels.contains(s.charAt(i))&&i<j){
                i++;
            }
            while (!vowels.contains(s.charAt(j))&&i<j){
                j--;
            }
            if (i<j){
                char t ;
                t=temp[i];
                temp[i]=temp[j];
                temp[j]=t;
                i++;
                j--;
            }

        }
        return new String(temp);
    }
}

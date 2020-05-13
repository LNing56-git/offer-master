package com.reCode;

public class LC_680 {
    public boolean validPalindrome(String s) {
        int i=0, j=s.length()-1;
        while (i<j){
            if (s.charAt(i++)!=s.charAt(j--)){
                return isPalindrome(i,++j,s)||isPalindrome(--i,--j,s);
            }
        }
        return true;
    }
    public boolean isPalindrome(int i,int j,String s){
        while (i<j){
            if (s.charAt(i++)!=s.charAt(j--)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String a = "cbbcc";
        new LC_680().validPalindrome(a);
    }
}

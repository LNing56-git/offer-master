package com.LeetCode;

public class LC_680 {
    public boolean validPalindrome(String s) {
        char[] str = s.toCharArray();
        int i=0,j=s.length()-1;
        int n=1;
        boolean flag = true;
        while(i<j){
            if(str[i]==str[j]){
                i++;
                j--;
            }else if(str[i]!=str[j]&&n==1){
                n--;
                if(str[i]==str[j-1]&&str[i+1]==str[j]&&i+3<j){
                    if(str[i+2]==str[j-1]){
                        i++;
                    }else if(str[i+1]==str[j-2]){
                        j--;
                    }
                }
                else if(str[i]==str[j-1]&&i<=j-1){
                    i++;
                    j-=2;
                }else if(str[i+1]==str[j]&&i+1<=j){
                    i+=2;
                    j--;
                }else if(i+1==j){
                    break;
                }
                else {
                    flag = false;
                    break;
                }
            }else {
                flag = false;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
            LC_680 lc_680 = new LC_680();
        System.out.println(lc_680.validPalindrome("ececaacec"));
    }
}

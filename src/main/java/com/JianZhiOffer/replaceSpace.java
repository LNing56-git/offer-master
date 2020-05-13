package com.JianZhiOffer;

public class replaceSpace {
    public String replaceSpace(StringBuffer str) {
        int len = str.length();
        StringBuffer tem = new StringBuffer("");
        for (int i=0;i<len;i++ ){
            if(str.charAt(i)==' '){
                tem.append("%20");
            }else {
                tem.append(str.charAt(i));
            }
        }
        return tem.toString();
    }
}

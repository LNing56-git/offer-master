package com.IO;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class ReadFileContent {
    public static void readFileContent(String filePath)throws IOException {

    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        String a = "嘟嘟";
        byte[] bytes = a.getBytes();
        String ut = new String(bytes,"utf-8");
        for(byte b:bytes){
            System.out.println(b);
        }
    }
}

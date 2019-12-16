package com.IO;

import java.io.*;

/**
 * 文件的io
 * 同时增加装饰者模式
 */
public class copyFile {
    public void copy(String in,String out) throws Exception {
        FileInputStream inputStream = new FileInputStream(in);
        FileOutputStream outputStream = new FileOutputStream(out);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        byte[] bytes = new byte[20*1024];
        int n;

        Writer writer = new OutputStreamWriter(outputStream,"utf-8");
        while ((n=inputStream.read(bytes,0,bytes.length))!=-1){
                bufferedOutputStream.write(bytes,0,n);
        }
        inputStream.close();
        outputStream.close();
    }

    public static void main(String[] args) throws Exception {
        new copyFile().copy("C:\\Users\\Administrator\\Desktop\\考试\\特设.doc","C:\\Users\\Administrator\\Desktop\\考试\\new.txt");
    }
}

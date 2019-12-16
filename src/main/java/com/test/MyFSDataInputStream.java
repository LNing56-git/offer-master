package com.test;

import org.apache.hadoop.fs.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @since 2019/10/9
 * @author lining
 */
public class MyFSDataInputStream extends FSDataInputStream {
    private static MyFSDataInputStream myFSDataInputStream;
    private static InputStream inputStream;
    public MyFSDataInputStream(InputStream in) {
        super(in);
        inputStream = in;
    }

    /**
     * 单例模式创建实例
     * @param inputStream
     * @return
     */
    public static MyFSDataInputStream getInstance(InputStream inputStream){
        if(null == myFSDataInputStream){
            synchronized (MyFSDataInputStream.class){
                if(null == myFSDataInputStream){
                    myFSDataInputStream = new MyFSDataInputStream(inputStream);
                }
            }
        }
        return  myFSDataInputStream;

    }

    /**
     * 实现readline
     * @param fileSystem
     * @return
     */
    public static String readline(FileSystem fileSystem){
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String line = null;
        try {
            if((line = bufferedReader.readLine())!=null){
                bufferedReader.close();
                inputStream.close();
                return line;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}

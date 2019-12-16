package com.IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class listAllFiles {
    public static void Minor(File files){
        if(files==null||!files.exists()){
            return;
        }
        if(files.isFile()){
            System.out.println("文件名为"+files.getName());
            return;
        }
        for(File file:files.listFiles()){
            Minor(file);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Administrator\\Desktop\\考试");
        Minor(file);
    }
}

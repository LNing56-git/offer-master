package com.test;

import java.io.*;


/**
 * IO操作4个步骤:
 * 1.创建源：File file = new File("");
 * 2.选择流：is = new FileInputStream(file);
 * 3.操作：int a = is.read();
 * 4.释放：is.close();
 */
public class IOTest_01 {
    public static void main(String[] args) {
        IOTest_01 test_01 = new IOTest_01();
        test_01.copyFold("C:\\IO1","C:\\Users\\Administrator\\Desktop\\考试");

    }
    public void copyFold(String re,String dir){
        File file = new File(re);
        File file2 = new File(dir);
        File[] resource = file.listFiles();
        for(File file1:resource){
            File temp = new File(file2.getAbsolutePath()+File.separator+file1.getName());
            if(file1.isFile()){
                if(!temp.exists()) {
                    try {
                        temp.createNewFile();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                copyFile(file.getAbsolutePath()+File.separator+file1.getName(),file2.getAbsolutePath()+File.separator+file1.getName());
            }
            if(file1.isDirectory()){
                if(!temp.exists()){
                    temp.mkdirs();
                }
                copyFold(file1.getAbsolutePath(),file2.getAbsolutePath()+File.separator+file1.getName());
            }
        }
    }


    public  void copyFile(String re,String dir) {
        File file = new File(re);
        File file2 = new File(dir);
        InputStream is = null;
        OutputStream out = null;
        try {
            is = new FileInputStream(file);
            out = new FileOutputStream(file2);
            byte[] fd = new byte[3];
            int len=-1;
            while((len=is.read(fd))!=-1){
                out.write(fd,0,len);
                out.flush();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(null!=is){
                    is.close();
                }
                if(null!=out){
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

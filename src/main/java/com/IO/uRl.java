package com.IO;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class uRl {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://www.baidu.com");
        InputStream ip = url.openStream();

        InputStreamReader inputStreamReader = new InputStreamReader(ip,"utf-8");
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String line = "";
        while ((line=bufferedReader.readLine())!=null){
            System.out.println(line);
        }
        bufferedReader.close();
    }
}

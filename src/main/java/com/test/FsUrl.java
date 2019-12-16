import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import org.apache.hadoop.fs.*;
import org.apache.hadoop.io.IOUtils;


public class FsUrl {


    static{
        URL.setURLStreamHandlerFactory(new FsUrlStreamHandlerFactory());
    }



    public static void cat(String remoteFilePath){
        try(InputStream in=new URL("hdfs","localhost",9000,remoteFilePath).openStream()){
            IOUtils.copyBytes(in, System.out, 4096, false);
            IOUtils.closeStream(in);
        }catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String remoteFilePath="/Test/text.txt";
        try{
            System.out.println("去读文件："+remoteFilePath);
            FsUrl.cat(remoteFilePath);
            System.out.println("\n 读取完成");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}

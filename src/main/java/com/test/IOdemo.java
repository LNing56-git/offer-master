package com.test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;

public class IOdemo {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Administrator\\Desktop\\理想城堡\\images\\TIM截图20200113165723.png";
        File file = new File(path);
     //   FileInputStream fs = new FileInputStream(file) ;
   //     BufferedInputStream bufferedInputStream = new BufferedInputStream(fs);
        BufferedImage bufferedImage = ImageIO.read(file);
        int rgb = bufferedImage.getRGB(0, 0);
        int r = (rgb&16711680)>>16;
        int g = (rgb&65280)>>8;
        int b = (rgb&255);
        System.out.println("r:"+Integer.toHexString(r)+" g:"+Integer.toHexString(g)+" b:"+Integer.toHexString(b));
    }
}

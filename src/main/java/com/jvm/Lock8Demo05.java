package com.jvm;

import java.util.concurrent.TimeUnit;

class Phone{
    public static synchronized void sendEmail()throws Exception{
        TimeUnit.SECONDS.sleep(4); //枚举
        System.out.println("发邮件");
    }
    public static synchronized void sendSMS()throws Exception{
        System.out.println("发信息");
    }
    public void sayHello()throws Exception{
        System.out.println("hello");
    }
}
public class Lock8Demo05 {//线程的调度！！
    public static void main(String[] args) throws InterruptedException {
        Phone phone1 = new Phone();
        Phone phone = new Phone();
        new Thread(()->{
            try {
                phone1.sendEmail();
            } catch (Exception e) {
                e.printStackTrace();
            }
        },"a").start();
        Thread.sleep(1000);
        new Thread(()->{
            try {
                phone1.sendSMS();
            } catch (Exception e) {
                e.printStackTrace();
            }
        },"b").start();
    }

}

package com.jvm;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Ticket{  //资源类=实例方法+实例变量
    private int number = 100;
    //List list = new ArrayList();
  //  synchronized  同步块
    Lock lock = new ReentrantLock();

    public void  sale(){
        lock.lock();
        try {
            if(number>0){
                System.out.println(Thread.currentThread().getName()+"\t卖出第："+(number--)+"\t 还剩下："+number);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}

/**
 * @author lining
 * 题目：三个售票员 卖出 30张票
 * 笔记：如何编写企业级的多线程代码
 * 固定的编程套路+模板是什么
 *
 * 1.在搞内聚低耦合的前提下，线程  操作    资源类
 *      1.1 先创建一个资源类
 *
 */
public class SaleTicketDemo1 {
    public static void main(String[] args) {//主线程，一切程序的入口
        Ticket ticket = new Ticket();//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                    for(int i=1;i<=40;i++){
////                        try {
////                        //    Thread.sleep(10);
////                        } catch (InterruptedException e) {
////                            e.printStackTrace();
////                        }
//                        ticket.sale();
//                    }
//            }                   // new runnable blocked waitting(等待状态) time_waiting(过时不候) terminated
//        },"A").start();  //start 以后并不是立刻启动，等待cpu调度
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for(int i=1;i<=40;i++){
//                    ticket.sale();
//                }
//            }                   // new runnable blocked waitting(等待状态) time_waiting(过时不候) terminated
//        },"B").start();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for(int i=1;i<=40;i++){
//                    ticket.sale();
//                }
//            }                   // new runnable blocked waitting(等待状态) time_waiting(过时不候) terminated
//        },"C").start();
        new Thread(()->{for(int i =0;i<40;i++){ticket.sale();}},"A").start();
        new Thread(()->{for(int i =0;i<40;i++){ticket.sale();}},"B").start();
        new Thread(()->{for(int i =0;i<40;i++){ticket.sale();}},"C").start();
   }
}

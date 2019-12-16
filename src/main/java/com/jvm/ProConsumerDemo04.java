package com.jvm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//多对一 资源类  加锁
class Aircondition{
    private int number = 0;
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    public  void increment()throws Exception{
        lock.lock();
        try{
            while (number!=0){
                //this.wait(); synchronized用的
                condition.await();

            }
            number++;
            System.out.println(Thread.currentThread().getName()+"\t"+number);
           // this.notify();synchronized用的
            condition.signalAll();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }

    }
    public  void decrement()throws Exception{
        lock.lock();
        try{
            while (number==0){
                //this.wait(); synchronized用的
                condition.await();

            }
            number--;
            System.out.println(Thread.currentThread().getName()+"\t"+number);
            // this.notify();synchronized用的
            condition.signalAll();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }

    }
//    public synchronized void decrement()throws Exception{
//        while (number==0){
//            this.wait();
//        }
//            number--;
//        System.out.println(Thread.currentThread().getName()+"\t"+number);
//        this.notify();
//    }

    /**
     * 可重入锁
     */
}
public class ProConsumerDemo04 {
    public static void main(String[] args) {
//        int [] a = {1,2};
        Aircondition aircondition = new Aircondition();
        new Thread(()->{
            try {
                for (int i=1;i<11;i++){
                    aircondition.increment();

                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        },"a").start();
        new Thread(()->{
            try {
                for (int i=1;i<11;i++){
                    aircondition.decrement();

                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        },"b").start();
        new Thread(()->{
            try {
                for (int i=1;i<11;i++){
                    aircondition.increment();

                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        },"c").start();
        new Thread(()->{
            try {
                for (int i=1;i<11;i++){
                    aircondition.decrement();

                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        },"d").start();
    }
}

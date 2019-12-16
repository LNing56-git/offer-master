package com.jvm;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
//判断  干活  通知
class ShareData{
   private int number = 1;//A:1 B:2 C:3
   private Lock lock = new ReentrantLock();
   private Condition condition1 = lock.newCondition();
   private Condition condition2 = lock.newCondition();
   private Condition condition3 = lock.newCondition();
   public void print5(){
       lock.lock();
       try{
           //1.判断
            while (number!=1){
                condition1.await();
            }
           //2.干活
           for(int i=0;i<5;i++){
               System.out.println(Thread.currentThread().getName()+"\t"+i);
           }
           //3.通知
           number = 2;
           condition2.signal();
       }catch (Exception e){
           e.printStackTrace();
       }finally {
            lock.unlock();
       }

   }
   public void print10(){
        lock.lock();
        try{
            //1.判断
            while (number!=2){
                condition2.await();
            }
            //2.干活
            for(int i=0;i<10;i++){
                System.out.println(Thread.currentThread().getName()+"\t"+i);
            }
            //3.通知
            number = 3;
            condition3.signal();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }

    }
    public void print15(){
        lock.lock();
        try{
            //1.判断
            while (number!=3){
                condition3.await();
            }
               //2.干活
            for(int i=0;i<15;i++){
                System.out.println(Thread.currentThread().getName()+"\t"+i);
            }
            //3.通知
            number = 1;
            condition1.signal();
        }catch (Exception e){
                            e.printStackTrace();
        }finally {
                    lock.unlock();
        }

    }
}

/**
 * @author lining
 * @since
 *
 */
public class ConditionDemo {

    public static void main(String[] args) {
        ShareData shareData = new ShareData();
        new Thread(()->{for(int i=1;i<11;i++)shareData.print5();},"a").start();
        new Thread(()->{for(int i=1;i<11;i++)shareData.print10();},"b").start();
        new Thread(()->{for(int i=1;i<11;i++)shareData.print15();},"c").start();
    }

}

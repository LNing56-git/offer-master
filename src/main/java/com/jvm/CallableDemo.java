package com.jvm;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

class MyThread implements Runnable{

    @Override
    public void run() {

    }
}
class MyThread2 implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        System.out.println("进来了");
        return 1024;
    }
}
//线程有三种：继承Thread类和实现Runnable接口 在原有的基础上Callable接口
//不同点：
public class CallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask futureTask = new FutureTask(new MyThread2());//需要返回值 就继承 Callable  不要就继承Runnable   已经继承了Runnable接口，同时构造方法里面加了Callable的参数
        new Thread(futureTask,"a").start();
       Integer result = (Integer) futureTask.get();
        System.out.println(result);
    }
}

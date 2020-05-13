package com.single;

/**
 * @author lining
 * 懒汉式
 * 用到的时候检查有没有实例，有就返回，没有就新建，有线程安全和不安全两种
 * 写法，区别是加synchronized
 */
public class LHan {
    private static LHan instance;

    private LHan(){}

    public static LHan getInstance(){
        if (instance==null){
            instance = new LHan();
        }
        return instance;
    }
}

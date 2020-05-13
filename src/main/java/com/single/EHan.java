package com.single;

/**
 * @author lining
 * 饿汉式  不管你有没有用到，先创建。好处是线程安全，坏处是浪费空间
 */
public class EHan {
    private static EHan instance = new EHan();

    private EHan(){}

    public static EHan getInstance(){
        return instance;
    }
}
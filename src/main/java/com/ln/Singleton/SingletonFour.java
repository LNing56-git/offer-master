package com.ln.Singleton;

/**
 *  预先初始化static变量 的单例模式  非Lazy  线程安全
 *  优点：
 *  线程安全
 *  缺点：
 * 1、非懒加载，如果构造的单例很大，构造完又迟迟不使用，会导致资源浪费。
 * @author lining
 * @since 2019/9/1
 */
public class SingletonFour {
    //单例变量，static的，在类加载时进行一次初始化一次，保证线程安全
    private static SingletonFour instance= new SingletonFour();

    private SingletonFour(){
    }
    public static SingletonFour getInstance(){
        return instance;

    }
    private SingletonFour singletonFour1;
    public   SingletonFour getInstance1(){
        return singletonFour1;
    }
}

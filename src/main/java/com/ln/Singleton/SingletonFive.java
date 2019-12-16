package com.ln.Singleton;

public class SingletonFive {
    /**
     * 内部类，用于实现lazy机制
     * 优点：
     * 1.线程安全
     * 2.lazy
     * 缺点：
     * 1.待发现
     *
     * @author lining
     * @since 2019/9/1
     */
    private static class SingletonHolder {
        //单例变量
        private static SingletonFive instance = new SingletonFive();
    }
    //私有化的构造方法，保证外部的类不能通过构造器来实例化。
    private SingletonFive(){

    }

    /**
     * 获取单例对象实例
     * @return  单例对象
     */
    public static SingletonFive getInstance(){

        return SingletonHolder.instance;
    }
}


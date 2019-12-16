package com.ln.Singleton;
/**
 * @Description 基础的单例模式，lazy模式，非线程安全
 * @author ln
 * @since 2019/9/2
 */
public class SingLetonOne {
    //单例实例变量
    private static SingLetonOne instance = null;

    /**
     * 私有化构造器，保证外部的类不能通过构造器来实例化
     */
    private SingLetonOne(){

    }

    /**
     * 获取单例对象实例
     * @return 单例对象
     */
    public SingLetonOne getInstance(){
        if(instance == null){
            instance = new SingLetonOne();
        }
        return  instance;
    }

}

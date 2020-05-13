package com.single;

/**
 * @author lining
 * 双检锁，综合了懒汉式和饿汉式的优缺点而成
 * 在synchronized外面加一层if判断既保证了线程安全，又节省了空间，还提高了效率
 */
public class DoubleCheck {
    private static DoubleCheck instance;

    private DoubleCheck(){

    }

    public static DoubleCheck getInstance(){
        if (instance==null){
            synchronized (DoubleCheck.class){
                if (instance==null){
                    instance = new DoubleCheck();
                }
            }
        }
        return instance;
    }


}

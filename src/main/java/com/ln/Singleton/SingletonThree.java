package com.ln.Singleton;

/**
 * 双重检查锁 Double-checked locking
 * @author lining
 * @since 2019/9/1
 *
 */
public class SingletonThree {
    /** 单例实例变量  */
    private static SingletonThree instance = null;
    //私有化构造器，保证外部的类不能通过构造器来实例化。
    private SingletonThree(){

    }
    /**
     * 获取单例对象实例
     * 同步方法，实现线程互斥访问，保证线程是安全的
     * 这个方法可行么？分析一下发现是不行的！
     * 　　1、线程A和线程B同时进入//1的位置。这时instance是为空的。
     * 　　2、线程A进入synchronized块，创建实例，线程B等待。
     * 　　3、线程A返回，线程B继续进入synchronized块，创建实例。。。
     * 　　4、这时已经有两个实例创建了。
     * @return 单例对象
     */
//    public SingletonThree getInstance(){
//        if(instance == null){
//            synchronized (SingletonThree.class){
//                instance = new SingletonThree();
//            }
//        }
//        return instance;
//    }

    /**
     *     1、线程A进入getInstance()方法。
     * 　　2、因为此时instance为空，所以线程A进入synchronized块。
     * 　　3、线程A执行 instance = new SingletonThree(); 把实例变量instance设置成了非空。（注意，实在调用构造方法之前。）
     * 　　4、线程A退出，线程B进入。
     * 　　5、线程B检查instance是否为空，此时不为空（第三步的时候被线程A设置成了非空）。线程B返回instance的引用。（问题出现了，这时instance的引用并不是SingletonThree的实例，因为没有调用构造方法。）
     * 　　6、线程B退出，线程A进入。
     * 　　7、线程A继续调用构造方法，完成instance的初始化，再返回。
     * @return 单例对象
     */
//    public SingletonThree getInstance(){
//        if(instance ==null ){
//            synchronized (SingletonThree.class){
//                if(instance == null){
//                    instance = new SingletonThree();
//                }
//            }
//
//        }
//        return instance;
//    }

    /**
     *     1、线程A进入getInstance()方法。
     * 　　2、因为instance是空的 ，所以线程A进入位置//1的第一个synchronized块。
     * 　　3、线程A执行位置//2的代码，把instance赋值给本地变量temp。instance为空，所以temp也为空。
     * 　　4、因为temp为空，所以线程A进入位置//3的第二个synchronized块。
     * 　　5、线程A执行位置//4的代码，把temp设置成非空，但还没有调用构造方法！（“无序写”问题）
     * 　　6、线程A阻塞，线程B进入getInstance()方法。
     * 　　7、因为instance为空，所以线程B试图进入第一个synchronized块。但由于线程A已经在里面了。所以无法进入。线程B阻塞。
     * 　　8、线程A激活，继续执行位置//4的代码。调用构造方法。生成实例。
     * 　　9、将temp的实例引用赋值给instance。退出两个synchronized块。返回实例。
     * 　　10、线程B激活，进入第一个synchronized块。
     * 　　11、线程B执行位置//2的代码，把instance实例赋值给temp本地变量。
     * 　　12、线程B判断本地变量temp不为空，所以跳过if块。返回instance实例
     * @return 单例对象
     */
    public SingletonThree getInstance(){
        if(instance == null){
            synchronized (SingletonThree.class){
                SingletonThree temp = instance;
                if(temp == null){
                    synchronized (SingletonThree.class){
                        temp = new SingletonThree();
                    }
                    instance = temp;
                }
            }
        }
        return instance;
    }

}

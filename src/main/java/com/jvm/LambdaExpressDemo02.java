package com.jvm;

/**
 * @author lining
 * 1.函数式编程
 *   int age =23;
 *   y = kx + 1;
 *   面向接口编程
 *   default接口可以写方法
 *   1.拷贝小括号，写死右箭头，落地大括号
 *   2.@FunctionalInterface   //函数接口(只有函数式接口才能用lambda表达式)
 *   3.default
 *   4.static
 */
//流式编程
//拷贝中括号，写死右箭头，落地大括号
    //
    @FunctionalInterface   //函数接口(只有函数式接口才能用lambda表达式)   隐式定义
interface Foo{
  //  public void sayHello();
    public int add(int x,int y);
    public default int mul(int x,int y){   //多个
        return x*y;
    }
    public static int div2(int x,int y){   //多个
        return x/y;
    }
}
public class LambdaExpressDemo02 {
    public static void main(String[] args) {
//            Foo foo = ()->{ System.out.println("sayhello"); } ;
//            foo.sayHello();
//        Foo foo = new Foo() {
////            @Override
////            public void sayHello() {
////
////            }
////
////            @Override
////            public int add(int x) {
////                return 0;
////            }
////        }
        Foo foo = (int x,int y)->{
            System.out.println("进入方法");
            return x+y;
        };
        System.out.println(foo.add(3,5));
        System.out.println(foo.mul(3,5));
        System.out.println(Foo.div2(6,3));
        new Thread(()->{for(int i=0;i<40;i++) System.out.println(Foo.div2(4,4));},"A").start();
    }
}

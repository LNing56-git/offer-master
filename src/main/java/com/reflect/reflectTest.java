package com.reflect;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class reflectTest {
    public static void main(String[] args) throws Exception{
        //可以创建任意类的对象，可以执行任意方法
        //需求：写一个框架，不能改变该类的任何代码的前提下，可以帮助我们创建任意类的对象，并且执行其中的方法
        //实现：
        /**
         * 实现:
         * 1.配置文件
         * 2.反射
         * 步骤：
         * 1.将需要创建的对象的全类名和需要执行的方法定义在配置文件中
         * 2.在程序中加载读取配置文件
         * 3.使用反射技术来加载类文件进内存
         * 4.创建对象
         * 5.执行
         */
        //1.1创建properties对象
        Properties pro = new Properties();
        //1.2加载配置文件，转换为一个集合(map)
        //1.2.1获取class目录下的配置文件
        ClassLoader classLoader = reflectTest.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("pro.properties");//获取配置文件转为字节流
        pro.load(inputStream);
        //2.1获取配置文件中定义的数据
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");
        //3.加载该类进内存
        Class cls = Class.forName(className);
        //4.创建对象
        Object person = cls.newInstance();
        //5.创建方法对象
        Method method = cls.getMethod(methodName);
        //6.执行方法
        method.invoke(person);
    }
}

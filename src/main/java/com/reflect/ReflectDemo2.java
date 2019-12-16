package com.reflect;

import javax.swing.table.TableRowSorter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectDemo2 {
    public static void main(String[] args)throws Exception {
        //0.获取Person的Class对象
        Class personClass = Person.class;
//        Field[] fields = personClass.getFields();//获取public 修饰的成员变量
//        for (Field field:fields){
//            System.out.println(field);
//        }
//        Field a = personClass.getField("a");
//        //获取成员变量a的值
//        Person person = new Person();
//        a.set(person,"11");
//        System.out.println(person);//获取person对象a的值
//        Field[] decalredFields = personClass.getDeclaredFields();
//        for (Field field:decalredFields){
//            System.out.println(field);
//        }
//        Field d= personClass.getDeclaredField("d");
//        //忽略访问权限修饰符的安全检查
//        d.setAccessible(true);
//        d.set(person,"222");
//        Object value =d.get(person);
//        System.out.println(value);
        /////////////////////////////////////////
//        Constructor constructor = personClass.getConstructor(String.class,int.class);
//////        System.out.println(constructor);
//////      //  constructor.setAccessible(true);
//////        Object person = constructor.newInstance("lining",22);
//////        System.out.println(person);
//////        personClass.newInstance();//空参数构造器
         Method method = personClass.getMethod("eat");
         Person person = new Person();
         method.invoke(person);
         Method method1 = personClass.getMethod("eat", String.class);
         method1.invoke(person,"饭");

    }
}

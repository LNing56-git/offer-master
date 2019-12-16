package com.reflect;

public class reflectDemo1 {
    public static void main(String[] args) throws Exception{
       //1.Class.forName("全类名")
        Class cls1 =  Class.forName("com.reflect.Person");
        System.out.println(cls1);
        //2.类名.class
        Class cls2 = Person.class;
        System.out.println(cls2);
        //3.对象名.getClass()
        Person person = new Person();
        Class cls3 = person.getClass();
        System.out.println(cls3);
        //==比较三个对象
        System.out.println(cls1==cls2);
        System.out.println(cls2==cls3);
        System.out.println(cls1==cls3);

    }
}

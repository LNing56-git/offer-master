package com.IO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * ObjectOutputStream 可以实现对象的序列化（将一个对象转换成字节序列，方便存储和传输）
 * 序列化：ObjectOutputStream.writeObject()
 * 反序列化：ObjectInputStream.readObject()
 * 无法对静态变量进行序列化，因为序列化只是保存对象的状态，静态变量属于类的状态。
 * transien关键字可以使一些属性不会被序列化。
 * ArraList中存储的数据的数组elementData是用transient修饰的，因为这个数组是动态扩展的，并不是所有的空间
 * 都被使用，因此就不需要所有的内容都被序列化。通过重写序列化和反序列化方法，使得可以只序列化有内容的
 * 那部分数据
 * private transient Object[] elementData;
 */
public class Seri {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        A a = new A("lining",18);
        String fileUrl = "C:\\Users\\Administrator\\Desktop\\考试\\new.txt";
        FileOutputStream outputStream = new FileOutputStream(fileUrl);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(a);
        objectOutputStream.close();
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileUrl));
        A b = (A)objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(b);
        List<String> list = new ArrayList<>();
    }
}

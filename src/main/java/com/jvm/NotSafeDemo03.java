package com.jvm;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 *
 */
public class NotSafeDemo03 {


    public static void main(String[] args) {
      //  List<String> list = Collections.synchronizedList(new ArrayList<>());
      Map<String,String>  hashMap = new HashMap<>();
        for (int i=1;i<3;i++){ new Thread  (()->{hashMap.put(UUID.randomUUID().toString().substring(0,8),"1");
            System.out.println(hashMap);},String.valueOf(i)).start(); }
    }

    private static void setNotSafe() {
        Set<String> set = new HashSet<>();
        for (int i=1;i<3;i++){ new Thread  (()->{set.add(UUID.randomUUID().toString().substring(0,8));
            System.out.println(set);},String.valueOf(i)).start(); }
    }

    private static void listNotSafe() {
        List<String> list = new CopyOnWriteArrayList<>();//写时复制
        for (int i=1;i<3;i++){ new Thread  (()->{list.add(UUID.randomUUID().toString().substring(0,8));
            System.out.println(list);},String.valueOf(i)).start(); }
    }
}

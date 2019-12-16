package com.IO;

import java.io.Serializable;

public class A implements Serializable {
    private String  name;
    private int val;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "A{" +
                "name='" + name + '\'' +
                ", val=" + val +
                '}';
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public A(String name, int val) {
        this.name = name;
        this.val = val;
    }
}

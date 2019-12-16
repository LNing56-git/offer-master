package com.test;

public class node {
    int value;
    node next;
    String name;

    public node() {
    }

    public node(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public node(int value) {
        this.value = value;
    }
}

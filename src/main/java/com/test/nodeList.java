package com.test;

public class nodeList {
    public static void main(String[] args) {
        node n1 = new node(1,"1");
        node n2 = new node(2);
        n1.next=n2;

        node n = new node(3,"3");
        node nextnode = n1.next;
        n1.next = n;
        n = n1;

        System.out.println(n.value +" "+n.next.name);
    }
}

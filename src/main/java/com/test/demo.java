package com.test;
class people{
    int val;

    public people(int val) {
        this.val = val;
    }

}
public class demo {
    public static void main(String[] args) {
        people p1 = new people(1);
        people p2 = new people(1);
        Integer t1 = new Integer(1);
        Integer t2 = new Integer(1);
        System.out.println(t1.equals(t2));
    }
}

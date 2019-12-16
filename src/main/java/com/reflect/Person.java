package com.reflect;

public class Person {
    private String name;
    private int age ;
    public String a;
    protected String b;
    String c;
    private String d;
    public Person() {
    }
    public void eat(){
        System.out.println("吃");
    }
    public void eat(String a){
        System.out.println("吃"+a);
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                ", d='" + d + '\'' +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }
}

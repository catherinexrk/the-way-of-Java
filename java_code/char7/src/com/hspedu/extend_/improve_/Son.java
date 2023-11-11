package com.hspedu.extend_.improve_;

public class Son extends Father{
    public String name;
    private int age;
    private double score;
    public Son() {
        System.out.println("调用子类无参构造函数");
    }

    public Son(int age){

        System.out.println("调用子类有参构造函数");
    }
}

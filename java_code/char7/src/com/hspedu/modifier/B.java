package com.hspedu.modifier;

public class B {
    public void say(){
        A a = new A();
        //B是A的同包下，不能访问private类，可以访问public protected default
        //同一个包下，可以访问public protected 默认  不可以访问private
        System.out.println("n1 = " + a.n1 + " n2 = " + a.n2 + " n3 = " + a.n3);
    }
}

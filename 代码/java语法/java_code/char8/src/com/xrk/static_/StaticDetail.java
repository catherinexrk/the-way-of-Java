package com.xrk.static_;

public class StaticDetail {
    public static void main(String[] args) {
        B b = new B();
//        System.out.println(B.n1);  wrong
//        System.out.println(B.n2);  true
    }
}

class B {
    public int n1 = 100;
    public  static int n2 = 200;
}

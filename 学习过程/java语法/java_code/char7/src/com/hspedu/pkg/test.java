package com.hspedu.pkg;

import com.hspedu.modifier.A;

public class test {
    public static void main(String[] args) {
        A a = new A();
        //test类为不同包，只能访问public
        System.out.println("n1 = " + a.n1 );
    }
}


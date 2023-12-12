package com.hspedu.polymorphic.poloytest;

import com.hspedu.override_.Person;

public class Test {
    public static void main(String[] args) {
        BB bb = new BB();
        System.out.println(bb instanceof BB);
        System.out.println(bb instanceof AA);

        AA aa = new BB();
        System.out.println(aa instanceof AA);
        System.out.println(aa instanceof BB);

        Object ob = new Object();
        System.out.println(ob instanceof AA);
    }
}

class AA{ }

class BB extends AA{}

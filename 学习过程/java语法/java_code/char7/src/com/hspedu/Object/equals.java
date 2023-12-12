package com.hspedu.Object;

import java.sql.SQLOutput;

public class equals {
    public static void main(String[] args) {
        A a = new A();
        A b = a;
        A c = b;
        System.out.println(a.equals(b));
        //如果相等，判断为相同类型
        Integer n1 = new Integer(100);
        Integer n2 = new Integer(100);
        System.out.println(n1 == n2); //判断是否为同一个对象
        System.out.println(n1.equals(n2));


    }
}

class A{

}

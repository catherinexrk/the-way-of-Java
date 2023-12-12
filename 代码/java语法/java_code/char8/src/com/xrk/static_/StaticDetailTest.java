package com.xrk.static_;

public class StaticDetailTest {
}

class test{
    public static int num = 10;

    public int num2 = 20;

    public void normalFunc(){
        System.out.println(num);
        System.out.println(num2);
    }

    public static void staticFunc(){
        System.out.println(num);
//        System.out.println(num2);
    }
}

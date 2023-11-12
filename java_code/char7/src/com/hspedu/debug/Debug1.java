package com.hspedu.debug;

public class Debug1 {
    public static void main(String[] args) {
        //逐行执行
        int res = 0 ;
        for (int i = 0; i < 5; i++) {
            res += i;
            System.out.println(" i = " + i);
            System.out.println(" res = " + res);
        }
        System.out.println("over");
        System.out.println("逐行执行结束");
    }
}

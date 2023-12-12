package com.hspedu.encap;

public class TestAccount {
    public static void main(String[] args) {
        Account test = new Account("小明","1236",1400.2);
        System.out.println(test.getBanlance() + " " + test.getName() + " " + test.getPwd());
    }
}

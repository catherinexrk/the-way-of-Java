package com.hspedu.Dynamica;

public class Dyna {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.getI());
        System.out.println(a.sayI());
    }
}

class A{
    private int i;

    public int getI(){
        return i = i + 10;
    }

    public int sayI(){
        return getI() + 30;
    }
}

class B extends A{
    private int i = 20;

    public int getI(){
        return i = i + 20;
    }

//    public int sayI(){
//        return 20;
//    }
}

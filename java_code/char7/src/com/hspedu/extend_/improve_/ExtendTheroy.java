package com.hspedu.extend_.improve_;

public class ExtendTheroy {
    public static void main(String[] args) {
        Son2 son = new Son2();
        System.out.println(son.age);
    }
}

class Grandfather{
    public String name = "老明";
    public int age = 78;


}

class Father2 extends Grandfather {
    public String name = "中明";
//    public int age = 28;
}

class Son2 extends Father2 {
    public String name = "小明";
//    private int age = 13;
}

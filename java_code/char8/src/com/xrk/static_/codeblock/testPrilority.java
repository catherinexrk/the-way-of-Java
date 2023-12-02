package com.xrk.static_.codeblock;

public class testPrilority {
    public static void main(String[] args) {
        test a = new test();

    }
}

class test{
    static {
        System.out.println("静态代码块初始化完成！");
    }

    public static int sum = getsum();

    public static int getsum(){
        System.out.println("静态函数调用！");
        return 100;
    }

    {
        System.out.println("普通代码块初始化完成！");
    }


}

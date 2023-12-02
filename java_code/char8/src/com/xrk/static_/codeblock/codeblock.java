package com.xrk.static_.codeblock;

import java.sql.SQLOutput;

public class codeblock {
    public static void main(String[] args) {
        AA aa = new AA();
        AA aa2 = new AA();

    }
}

class BB{
    static {
        System.out.println("BB静态代码块1被执行");
    }

}
class AA extends BB{
    static {
        System.out.println();
        System.out.println("AA静态代码块1被执行");
        System.out.println("test aa static code block");
        System.out.println("test identify");
    }

    //    普通代码块
    {
        System.out.println("我是普通代码块,没创建一个对象我都会被调用");
    }

}


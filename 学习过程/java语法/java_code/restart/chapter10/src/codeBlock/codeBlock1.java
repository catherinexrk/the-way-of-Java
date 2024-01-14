package codeBlock;

/**
 * @author 陶笛
 */
public class codeBlock1 {
    public static void main(String[] args) {
//        A a = new A();
        Cat cat = new Cat();
        System.out.println(Cat.n1);
    }
}

class B{
    static {
        System.out.println("B的静态代码块被执行");
    }
}

class A extends B{
    static {
        System.out.println("A的静态代码块被执行");
    }
}

class Cat{

    public static int n1 = 10;//静态属性

    static {
        System.out.println("Cat静态代码块被执行");
    }
}

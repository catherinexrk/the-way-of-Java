package abstract_;

/**
 * @author 陶笛
 */
public class Abstact2 {
    public static void main(String[] args) {
        B b = new B();
        b.say();
    }
}

abstract class A {
    public abstract void say();
}

class B extends A{
    @Override
    public void say() {
        System.out.println("实现A的say方法");
    }
}

//test1
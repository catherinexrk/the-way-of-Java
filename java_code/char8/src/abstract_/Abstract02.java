package abstract_;

public class Abstract02 {
    public static void main(String[] args) {

    }
}

//抽象类不能被实例化
//抽象类可以没有abstract方法
//还可以有实现的方法
//一个类包含抽象方法，则这个类必须是抽象类
abstract class A {
    public void testFunc(){
        System.out.println("抽象类里面可以有实例方法");
    }
}

//abstract只能修饰类和方法，其余不可以
//抽象类还是类，可以有任意成员

abstract class B {
    private int num = 10;
    public String name;

    public  void testFunc(){
        System.out.println("hello");
    }

}

abstract class C {
    public abstract void say();
}

class D extends C {
    @Override
    public void say() {
        System.out.println("hello world");
    }
}


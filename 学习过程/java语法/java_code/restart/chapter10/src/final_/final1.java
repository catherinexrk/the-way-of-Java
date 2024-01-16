package final_;

/**
 * @author 陶笛
 */
public class final1 {
    public static void main(String[] args) {
        A a = new A();
//        a.n1 = 12;不可以修改局部变量


    }
}

class A{
    final int n1 = 10;
}

class B extends A{

}

//c不允许被继承
final class C{

}

//类不是final，但是方法是final，可以被子类继承并且被使用
class D{
    public final void hi(){}
}

class E extends D{

}

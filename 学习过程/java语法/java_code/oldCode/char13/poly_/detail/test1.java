package poly_.detail;

/**
 * @author 陶笛
 */
public class test1 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a instanceof Object );

        //判断对象的运行类型instanceof

        A a1 =new B();
        System.out.println(a1 instanceof B);
    }
}

class A {}

class B extends A {}
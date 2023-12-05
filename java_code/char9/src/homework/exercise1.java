package homework;

/**
 * @author 陶笛
 */
public class exercise1 {
    public static void main(String[] args) {
        A a = new A();
        a.f1();
    }
}

class A{

    public void f1(){

        class B { //局部内部类
            private final String NAME = "test";

            public void show() {
                System.out.println("NAME " + NAME);
            }
        }

        B b = new B();
        b.show();
    }
}

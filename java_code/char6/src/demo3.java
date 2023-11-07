public class demo3 {
    public static void main(String[] args) {
        B b =new B();
        b.useB();
    }
}

class A{
    public void useA(){
        System.out.println("A useA被调用");
    }
}

class B{
    public void useB() {
        A a = new A();
        a.useA();
        System.out.println("B useB");
    }
}

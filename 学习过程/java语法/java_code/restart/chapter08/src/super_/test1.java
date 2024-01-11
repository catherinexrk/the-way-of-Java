package super_;

/**
 * @author 陶笛
 */
public class test1 {
    public static void main(String[] args) {
        B b = new B();

    }
}

class A {
    public int n1 = 1;
    private int n2 = 2;
    protected int n3 = 3;
    private int n4 = 4;

    public void show(){
        System.out.println("父类show");
    }
}

class B extends A{
    public int n1 = 1;

    public void show(){
        System.out.println("子类show");
    }
}

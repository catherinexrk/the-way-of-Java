package static_;

/**
 * @author 陶笛
 */
public class VisitStatic {
    public static void main(String[] args) {
        System.out.println(B.n1);
//        System.out.println(B.n2);
    }
}

class A{
    public static String name = "认真学java，再接着转go";

}

class B {
    public static int n1 = 12;
    public int n2 = 20;
}

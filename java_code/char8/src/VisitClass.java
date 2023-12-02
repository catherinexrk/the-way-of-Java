import javax.swing.plaf.PanelUI;

public class VisitClass {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(A.name);
        System.out.println(a.name);
    }
}

class A{
    public static String name = " test name ";

    private int num = 12;//普通变量


}

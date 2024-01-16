package innerClass;

/**
 * @author 陶笛
 */
public class innerClass2 {
    public static void main(String[] args) {
        Outer2 outer2 = new Outer2();
        outer2.m1();
    }
}

class Outer2{
    private int n1 = 100;
    private void m2() {} //私有方法
    public void m1() {

        //不可以添加访问修饰符，但是可以使用final修饰词
        final class inner2{
            public void f1(){
                //局部内部类可以直接访问外部类的成员
                System.out.println("n1 = " + n1);
            }
        }

        inner2 inner2_ = new inner2();
        inner2_.f1();


    }


}

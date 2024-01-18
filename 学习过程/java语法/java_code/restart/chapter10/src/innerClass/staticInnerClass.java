package innerClass;

public class staticInnerClass {

}

class Outer9 {
    private int n1 = 10;
    private String name = "zhangsan";

    //inner9是一个静态内部类
    //1.放在外部类的成员位置
    //2.使用static修饰
    //3.可以直接访问外部类所有的静态成员、私有
    //4.随意添加访问修饰符
    //5.作用域
    static class Inner9 {

    }
}

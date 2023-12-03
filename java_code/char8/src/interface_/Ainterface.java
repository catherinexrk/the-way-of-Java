package interface_;

public interface Ainterface {
    //属性
    public int a = 4;

    //方法
    //在接口中，抽象方法可以省略abstract关键字
    public void say();

    //可以增加默认方法，加入default即可
    public default void test() {
        System.out.println("hello world!!!!");
    }
}


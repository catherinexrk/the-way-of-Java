package interface_;

public class interface02 {
    public static void main(String[] args) {

    }
}


//一个类实现一个接口，需要将该接口的全部抽象方法进行实现
class A_ implements Ainterface{
    @Override
    public void say() {
        System.out.println("hello world");
    }
}



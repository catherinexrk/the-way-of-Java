package interface_;

public class Interface04 {
    public static void main(String[] args) {

    }
}

//接口不能被实例化
//接口中的方法都是public方法，接口中的抽象方法不用加absract


interface IA{
    void say();

    void hi();
}

class Cat implements IA{

    @Override
    public void say() {
        System.out.println("say");
    }

    @Override
    public void hi() {
        System.out.println("hi");
    }
}

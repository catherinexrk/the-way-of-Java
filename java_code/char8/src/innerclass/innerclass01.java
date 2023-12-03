package innerclass;

public class innerclass01 {

}

class Outer{
    //外部类
    private int n1 = 100;

    public void m1(){
        System.out.println("m1");
    }

    {
        System.out.println("Outer的代码块");
    }
    public Outer(int n1){
        this.n1 = n1;
    }

    //内部类
    class Inner{ //在outer内部创建新的类
        //可以访问外部类的所有成员，包含私有的
        public void f1(){
            System.out.println("n1 = " + n1);//访问外部类的私有属性
            m1();

        }
    }
}

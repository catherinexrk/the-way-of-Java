package innerclass;

/**
 * 演示匿名内部类的使用
 */

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();
    }
}

class Outer04{
    private int n1 = 10;

    public void method(){
        //基于接口的匿名内部类
        //1.需求：想使用接口a，传统方法是写一个类去实现接口
//        Tiger tiger = new Tiger();
            //        tiger.cry();


        //创建好匿名内部类后，立马创建了Outer￥01实例
        //匿名内部类使用一次，就不能再使用了
            IA ia = new IA() {
                @Override
                public void cry() {
                System.out.println("tiger cry");
            }
        };
        System.out.println("tiger运行类型 = " +  ia.getClass());
    }
}

interface IA{
    public void cry();
}

class Tiger implements IA{
    @Override
    public void cry() {
        System.out.println("tiger cry");
    }
}

class Father{
    public Father(System name){}

    public void test(){}
}

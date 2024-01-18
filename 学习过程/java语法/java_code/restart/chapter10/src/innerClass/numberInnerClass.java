package innerClass;

public class numberInnerClass {
    public static void main(String[] args) {
        Outer8 outer8 = new Outer8();
        outer8.t1();

        Outer8.Inner08 inner08 = outer8.new Inner08();
        Outer8.Inner08 inner08_1 = outer8.getInner08Instance();

    }
}

class Outer8{
    private int n1 = 10;
    public String name = "zhangsan";

    //成员内部类
    //1.定义在外部内的成员位置上
    //2.可以添加任意修饰访问
    //3.成员内部类可以访问外部类的所有属性方法
    public class Inner08{

        private int n1 = 100;
        public void say(){
            System.out.println("n1 = " + n1 + " name = " + name);
        }
    }


    //返回一个inner08的实例
    public Inner08 getInner08Instance(){
        return new Inner08();
    }

    //调用方法
    public void t1(){
        Inner08 inner08 = new Inner08();
        inner08.say();
    }
}

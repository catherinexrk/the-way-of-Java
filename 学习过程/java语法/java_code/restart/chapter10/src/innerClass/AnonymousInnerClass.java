package innerClass;

import java.security.CryptoPrimitive;

/**
 * @author 陶笛
 * 演示匿名内部类的使用
 */
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer4 outer4 = new Outer4();
        outer4.method();
    }

}

class Outer4{
    private int n1 = 10;

    public void method(){
        //1.基于接口的匿名内部类
        //1需求 使用接口IA
        //使用匿名内部类简化开发
        //tiger编译类型 IA
        // 运行类型  就是匿名内部类
        /*
            我们看底层
            class Outer4$1 implements IA {
               @Override
               public void cry() {
               System.out.println("老虎cry");
            }
           }

         */
        IA tiger = new IA() {
            @Override
            public void cry() {
                System.out.println("老虎cry");
            }
        };
        System.out.println(tiger.getClass());
        tiger.cry();
        tiger.cry();


        //2.演示基于类的匿名内部类
        Father father = new Father("jack"){
            @Override
            public void test() {
                System.out.println("匿名内部类重写father类的test方法");
            }
        };
        System.out.println(father.getClass());

    }
}

interface IA{
    public void cry();
}

class Father{
    public Father(String name){}

    public void test(){}
}

class Tiger implements IA{
    @Override
    public void cry() {
        System.out.println("老虎cry");
    }
}

class Dog implements IA{
    @Override
    public void cry() {
        System.out.println("Dog cry");
    }
}

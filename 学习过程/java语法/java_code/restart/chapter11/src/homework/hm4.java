package homework;

public class hm4 {
    public static void main(String[] args) {
        new A().f1();
    }
}

class A{

    private String name = "hello";
    public void f1(){


        class B{ //局部内部类
            private final String name = " aaa ";

            public void show(){
                System.out.println("name = " + name + "外部类的name = " + A.this.name);
            }
        }

        B b = new B();
        b.show();
    }
}

package single;

public class SingleTon2 {
    public static void main(String[] args) {
        Cat test = Cat.getInstance();
        System.out.println(test);
        System.out.println(test.n1);
    }
}

class Cat{
    private String name;
    public static int n1 = 100;
    private static Cat cat;

    //构造器私有化
    //提供一个人static静态对象
    //提供一个public的static方法，返回一个cat对象
    //懒汉式，用户使用时才创建对象



    private Cat(String name){
        this.name = name;
    }

    public static Cat getInstance(){
        if (cat == null){
            cat = new Cat("小可爱");
        }
        return cat;
    }
}

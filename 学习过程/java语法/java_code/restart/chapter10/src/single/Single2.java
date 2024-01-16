package single;

/**
 * @author 陶笛
 */

//懒汉式
public class Single2 {
    public static void main(String[] args) {
        Cat cat = Cat.getInstance();
        System.out.println(cat);

        Cat cat2 = Cat.getInstance();
        System.out.println(cat2);

        System.out.println(cat == cat2);
    }
}

class Cat{
    private String name;
    private static Cat cat;
    //构造器私有化
    //定义一个static静态对象
    //提供public的static方法，返回static对象

    private Cat(String name){
        System.out.println("构造器被调用");
        this.name = name;
    }

    public static Cat getInstance() {
        if (cat == null){
            cat = new Cat("小猫咪");
        }

        return cat;
    }
}

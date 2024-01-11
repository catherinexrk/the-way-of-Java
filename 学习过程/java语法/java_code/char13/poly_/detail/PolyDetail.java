package poly_.detail;

/**
 * @author 陶笛
 */
public class PolyDetail {
    public static void main(String[] args) {
        Animal animal = new Cat("小猫");


        //编译阶段，能调用哪些成员由编译类型来决定
        //运行阶段，由实际运行类型进行决定，如果当前类没有，进行父类搜索方法
        animal.func1();
        animal.func2();
//        animal.catchMouse();

        //使用向下转型
        //使用animal.catchMouse()

        Cat cat = (Cat) animal;
        cat.catchMouse();

        //属性看编译类型
        //方法看运行类型
        Animal animal1 = new Cat("aaa");
        System.out.println(animal1.n1);

        Animal animal2 = new Animal("aaa");
        System.out.println(animal2.n1);

        Cat cat1 = new Cat("AAA");
        System.out.println(cat1.n1);


    }
}

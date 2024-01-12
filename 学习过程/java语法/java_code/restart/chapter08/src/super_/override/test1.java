package super_.override;

/**
 * @author 陶笛
 */
public class test1 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.show();
    }
}

class Animal{
    public void show(){
        System.out.println("这是动物");
    }
}

class Dog extends Animal{
    @Override
    public void show() {
        System.out.println("我是狗");
    }
}

class Cat extends Animal{
    @Override
    public void show() {
        System.out.println("我是猫");
    }
}

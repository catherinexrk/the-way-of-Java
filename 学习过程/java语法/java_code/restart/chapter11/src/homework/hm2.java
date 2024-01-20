package homework;

public class hm2 {
    public static void main(String[] args) {
        Animal animal = new Cat();
        ((Cat)animal).shot();

    }
}

abstract class Animal{
    public abstract void shot();//抽象类
}

class Cat extends Animal{
    @Override
    public void shot() {
        System.out.println("cat shot");
    }
}

class Dog extends Animal{
    @Override
    public void shot() {
        System.out.println("Dog shot");
    }
}
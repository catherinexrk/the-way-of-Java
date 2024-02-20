package generic;

import java.util.ArrayList;

public class geneic1 {
    public static void main(String[] args) {
        //传统方法
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Dog("aaa",1));
        arrayList.add(new Dog("b",2));
        arrayList.add(new Cat("cat",3));

        for (Object o : arrayList) {
            Dog dog = (Dog) o;
            System.out.println(dog.getName() + "- " + dog.getAge());

        }

    }
}

class Dog{
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Cat{
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

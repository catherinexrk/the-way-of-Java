package generic;

import java.util.ArrayList;

/**
 * @author 陶笛
 */
public class generic1 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Dog("aaa",10));
        arrayList.add(new Dog("bbb",3));
        arrayList.add(new Dog("ccc",5));
        arrayList.add(new Cat("ddd",20));




        //遍历
        for (Object obj : arrayList) {
            Dog dog = (Dog) obj;
            System.out.println(dog.getName() + "-" + dog.getAge());
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
package generic.improve;

import java.util.ArrayList;

/**
 * @author 陶笛
 */
public class generic2 {
    public static void main(String[] args) {

        ArrayList<Dog> arrayList = new ArrayList<Dog>();

        arrayList.add(new Dog("aaa",10));
        arrayList.add(new Dog("bbb",3));
        arrayList.add(new Dog("ccc",5));

        //不小心加了个cat对象
//        arrayList.add(new Cat("ddd",20));

        //在遍历的时候，直接取出dog类型
        for (Dog dog : arrayList) {
            System.out.println(dog.getName() + "-" + dog.getAge());
        }


    }
}

//使用泛型完成代码
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

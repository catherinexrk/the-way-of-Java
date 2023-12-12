package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 陶笛
 */
public class exercise {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Dog("aa",12));
        list.add(new Dog("bb",4));
        list.add(new Dog("CC",4));

        for (Object dog : list) {
            System.out.println("dog = " + dog);
        }

        System.out.println("使用迭代器进行遍历");
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
                Object obj = iterator.next();
            System.out.println("dog = " + obj);
        }

    }
}


class Dog{
    private String name;
    private double age;

    public Dog(String name, double age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
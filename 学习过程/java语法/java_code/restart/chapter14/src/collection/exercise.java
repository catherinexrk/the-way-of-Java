package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class exercise {
    public static void main(String[] args) {
        List arrayList = new ArrayList();
        arrayList.add(new Dog("aaa",12));
        arrayList.add(new Dog("bbb",14));
        arrayList.add(new Dog("ccc",4));

        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println("obj = " + next);
        }
        System.out.println(iterator.hasNext());


        for (Object obj : arrayList){
            System.out.println(obj);
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

    @Override
    public String toString() {
        return "name = " + getName() + " age = " + getAge();
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

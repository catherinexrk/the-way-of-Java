package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;

/**
 * @author 陶笛
 */
public class exercise1 {
    public static void main(String[] args) {
//        LinkedHashSet hashset = new LinkedHashSet();
//        hashset.add(new Employ("milan",19));
//        hashset.add(new Employ("mike",23));
//        hashset.add(new Employ("jack",32));
//
//        System.out.println(new Employ("milan",30));
//
//        System.out.println("hashset = " +hashset);


    }
}

class Employee{
    private String name;
    private int age;

    public Employee(String name, int age) {
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

    //如果name和age相等，返回相同的hashcode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
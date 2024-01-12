package com.hspedu.debug;

public class Exercise {
    public static void main(String[] args) {
        Person person = new Person("jack", 12, '男');
        System.out.println(person);
    }
}

class Person{
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}

package com.hspedu.Object;

public class Exercise {
    public static void main(String[] args) {
        Person person = new Person("jack", 10, '男');
        Person person1 = new Person("jack", 10, '男');


        System.out.println(person.equals(person1));
    }
}

class Person{
    private String name;
    private int age;
    private char gender;

    //重写object的equal
    public boolean equals(Object obj){
        if (obj == this){
            return true;
        }
        if (obj instanceof Person){
            Person temp = (Person) obj;// 需要获取person中的各个属性，因此需要向下转型获取子类都有属性
            return this.name.equals(temp.name) && this.age == temp.age && this.gender == temp.gender;

        }

        return false;
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}

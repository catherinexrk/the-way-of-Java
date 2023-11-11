package com.hspedu.polymorphic.objetpoly;

public class TestAnimal {
    public static void main(String[] args) {
        Animal temp = new Cat();
        //编译类型animal 运行类型cat
        temp.cry();
        //编译类型animal 运行类型是dog
        temp = new Dog();
        temp.cry();
        //编译阶段能调用哪些类型完全由编译对象来决定
        
    }
}

package com.xrk.static_;

public class ChildGame {
    public static void main(String[] args) {
//        int count = 0;

        Child child1 = new Child("aaa");
        child1.count++;

        Child child2 = new Child("bbb");
        child2.join();
        child2.count++;

        Child child3 = new Child("ccc");
        child3.join();
        child3.count++;

        System.out.println("共有" + Child.count + "小孩加入游戏");
    }
}

class Child {
    private String name;

    public static int count = 0;//对child所有实例对象共享

    public Child(String name){
        this.name = name;
    }

    public void join(){
        System.out.println(name + "加入了游戏");
    }
}

package com.hspedu.encap;

public class demo1 {
    public static void main(String[] args) {
            Person p1 = new Person();
            p1.setName("jack");
            p1.setSalary(3000);
            p1.setAge(10000);

            p1.info();

    }
}

class Person{
    public String name;
    private int age;
    private double salary;

    //创建构造器
    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Person() {
    }

    //generate 自动部署
    //根据要求完善代码
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 6){
            this.name = name;
        } else {
            System.out.println("名字长度不对！长度需要在2-6字符范围内");
            this.name = "默认用户";
        }


    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >=1 && age <= 100){
            this.age = age;
        } else {
            System.out.println("你设置的年龄不正确，年龄需要在1--100区间");
            this.age = 20;//默认年龄
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void info(){
        System.out.println("name = " + name + " salary = " + salary + " age = " + age);
    }
}

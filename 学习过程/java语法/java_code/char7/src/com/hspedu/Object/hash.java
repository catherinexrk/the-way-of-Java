package com.hspedu.Object;

public class hash {
    public static void main(String[] args) {
        Monster monster = new Monster("小妖怪", "打扫", 1000);
        System.out.println(monster.toString());
//        System.out.println(monster.hashCode());
//        System.out.println(monster.getClass());
        System.out.println(monster);
    }
}


class Monster{
    private String name;
    private String job;
    private double salary;


    //重写tostring

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Monster(String name, String job, double salary) {
        this.name = name;
        this.job = job;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

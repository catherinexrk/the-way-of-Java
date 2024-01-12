package com.hspedu.extend_;

public class Pupil {
    //小学生考试情况
    public String name;
    public int age;
    private double score;

    public void testing(){
        System.out.println("小学生 " + name + "正在考数学...");
    }

    public void showInfo(){
        System.out.println("姓名 " +  name + " 分数 " + score);
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

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}

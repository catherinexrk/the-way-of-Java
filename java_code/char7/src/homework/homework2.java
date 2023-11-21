package homework;

import javax.xml.stream.events.StartDocument;

public class homework2 {
    public static void main(String[] args) {
        Student stu = new Student("小明",'男',15,"12323");
        stu.printInfo();

        System.out.println(stu.getClass());

    }
}

//父类
class Person{
    private String name;
    private char sex;
    private int age;

    public Person(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String play(){
        return name + "爱玩";
    }

    public String print(){
        return "姓名: " + name + "\n年龄: " + age + "\n性别: " +sex;
    }
}

class Student extends Person{
    private String stu_id;//学号

    public Student(String name, char sex, int age, String stu_id) {
        super(name,sex,age);
        this.stu_id = stu_id;
    }


    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    public void say(){
        System.out.println("我是" + super.getName() + "我会好好学习");
    }

    @Override
    public String play() {
        return super.play() + "足球";
    }

    public void printInfo() {
        System.out.println("学生的信息:");
        System.out.println(print());
        System.out.println("学好:" + stu_id);
        System.out.println("我承诺，我会好好学习");
    }
}

class Teacher extends Person{
    private int work_age;

    public Teacher(String name, char sex, int age, int work_age) {
        super(name,sex,age);
        this.work_age = work_age;
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }

    public void teach(){
        System.out.println("我是" + super.getName() +"我会认真教学");
    }

    @Override
    public String play() {
        return super.play() + "象棋";
    }

    public void printInfo(){
        System.out.println("教师的信息:");
        System.out.println(print());
        System.out.println("我会好好教书");
    }
}
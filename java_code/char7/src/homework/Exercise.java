//package homework;
//
//public class Exercise {
//    public static void main(String[] args) {
//        Professor professor = new Professor("贾宝玉", 45, 15000, 1.3, "教授");
//        professor.introduce();
//    }
//}
//
//class Teacher{
//    private String name;
//    private  int age;
//    private double salary;
//    private double grade;
//    private String post;//职称
//
//    public Teacher(String name, int age, double salary, double grade,String post) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
//        this.grade = grade;
//        this.post = post;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }
//
//    public void introduce(){
//        System.out.println("名字 " + getName() + " 年龄 " + getAge() + " 薪资 " + getSalary() + "职称 " + post);
//    }
//
//}
//
//
//
//class Professor extends Teacher{
//    public Professor(String name, int age, double salary, double grade, String post) {
//        super(name, age, salary, grade, post);
//    }
//
//    @Override
//    public void introduce() {
//        System.out.println("这是教授的信息");
//        super.introduce();
//    }
//}
//
//

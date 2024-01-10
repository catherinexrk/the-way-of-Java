package encap;

/**
 * @author 陶笛
 */
public class Encapsulation01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(1000);
        person.setName("ninja");
        person.setSalary(1233);

        System.out.println(person.info());



    }

}

class Person{
    public String name;
    private int age;
    private double salary;

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
        if (age > 1 && age < 100)
            this.age = age;
        else{
            System.out.println("年龄输入错误");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //写一个方法
    public String info(){
        return "个人信息: 姓名 " + name + " 年龄" + getAge() + " 薪资 " + getSalary();
    }
}

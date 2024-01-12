package homework;

/**
 * @author 陶笛
 */
public class hw2 {
    public static void main(String[] args) {

    }
}

class Teacher{
    private String name;
    private int age;
    private String post;//职称
    private double salary;
    private double salaryDegree;

    public Teacher(String name, int age, String post, double salary, double salaryDegree) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
        this.salaryDegree = salaryDegree;
    }

    public void introduce() { }

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

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalaryDegree() {
        return salaryDegree;
    }

    public void setSalaryDegree(double salaryDegree) {
        this.salaryDegree = salaryDegree;
    }
}

class Professor extends Teacher{

    public Professor(String name, int age, String post, double salary, double salaryDegree) {
        super(name, age, post, salary, salaryDegree);
    }

    @Override
    public void introduce() {
        System.out.println("name " + getName() + " age " + getAge() + " post " + "教授" + " salary " + getSalary() + " degeree " + getSalaryDegree());
    }
}

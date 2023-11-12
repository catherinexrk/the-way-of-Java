public class Main{
    public static void main(String[] args) {
        test t = new test();
        System.out.println(t.age);
    }
}

class test {
    private int age = 12;
    private double salary;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
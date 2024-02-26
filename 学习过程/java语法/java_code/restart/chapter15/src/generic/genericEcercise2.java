package generic;

import java.util.ArrayList;
import java.util.Comparator;

@SuppressWarnings("all")
public class genericEcercise2 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("aa",12000,new MyDate(2002,12,23)));
        employees.add(new Employee("jack",14000,new MyDate(2003,3,2)));
        employees.add(new Employee("bb",8000,new MyDate(2000,6,9)));

        for (Object o : employees) {
            System.out.println(o);
        }

        System.out.println("对员工进行排序");
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                //先按照name排序，name相同按照生日进行排序
                if (!(o1 instanceof Employee && o2 instanceof Employee)){
                    System.out.println("类型不匹配");
                    return 0;
                }
                //比较name
                int i = o1.getName().compareTo(o2.getName());
                if (i != 0){
                    return i;
                }
                //name相同，比较birthday的year





                return 0;
            }
        });


    }
}

class MyDate{
    private int year;
    private int month;
    private int day;



    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}

class Employee{
    private String name;
    private double sal;
    private MyDate birthday;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    public Employee(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }
}

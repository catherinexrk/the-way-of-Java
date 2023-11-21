package homework;

public class test {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("zhangsan", '男', 1000, "老师");
        Doctor doctor2 = new Doctor("zhangsan", '男', 1000, "老师");
        System.out.println(doctor.equals(doctor2));
    }
}

class Doctor {
    private String name;
    private char sex;
    private double salary;
    private  String job;

    public Doctor(String name, char sex, double salary, String job) {
        this.name = name;
        this.sex = sex;
        this.salary = salary;
        this.job = job;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if(!(obj instanceof Double)){
            return false;
        } else {
            Doctor doctor =(Doctor) obj;
            return this.name.equals(doctor.name) ;
        }
    }
}

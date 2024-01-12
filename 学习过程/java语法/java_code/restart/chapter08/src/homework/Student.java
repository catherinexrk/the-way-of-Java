package homework;

/**
 * @author 陶笛
 */
public class Student {
    private String name;
    private String sex;
    private int age;
    private int stu_id;

    public Student(String name, String sex, int age, int stu_id) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.stu_id = stu_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }
}

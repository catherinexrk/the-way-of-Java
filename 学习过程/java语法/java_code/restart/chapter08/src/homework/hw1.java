package homework;

/**
 * @author 陶笛
 */
public class hw1 {
    public static void main(String[] args) {
        Person[] arr = new Person[3];
        arr[0] = new Person("jack",20,"worker");
        arr[1] = new Person("mike",39,"manager");
        arr[2] = new Person("catherine",22,"student");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3-i-1;j++){
                if (arr[j].getAge() < arr[j+1].getAge()){
                    Person temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}

class Person{
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    @Override
    public String toString() {
        return "name " + getName() + " age " + getAge() + " job " + getJob();
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}

public class 构造器 {
    public static void main(String[] args) {
        Person3 test = new Person3("张三",12);

    }
}

class Person3 {
    String name;
    int age;
    public Person3(String pName,int pAge){
        name = pName;
        age = pAge;
        System.out.println("构造器被调用");
    }
}
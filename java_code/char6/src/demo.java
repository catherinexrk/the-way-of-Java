import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        String name;
        Scanner in = new Scanner(System.in);
        Cat cat = new Cat();
        cat.age=12;
        cat.name="小白";
        cat.color="白色";
        System.out.println("年龄 = " + cat.age + " 姓名 = " + cat.name + " 颜色 = " + cat.color );

        Cat cat2 = new Cat();
        cat2.color="黑色";
        cat2.name="小黑";
        cat2.age=2;
        System.out.println(cat2.name + " " + cat2.age + " " + cat2.color);

    }
}

class Cat{
    String name;
    int age;
    String color;
}

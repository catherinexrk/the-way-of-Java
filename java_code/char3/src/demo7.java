

import java.util.Scanner;

public class demo7 {
    public static void main(String[] args) {
        //input 接受用户的输入
        Scanner MyScanner=new Scanner(System.in);
        //接受用户输入
        System.out.println("请输入名字");
        String name = MyScanner.next();
        System.out.println("年龄");
        int age = MyScanner.nextInt();
        System.out.println("薪资");
        double salary = MyScanner.nextDouble();
        System.out.println("姓名"+ name +"年龄" + age + "薪资" + salary);

        Scanner cin = new Scanner(System.in);
        cin.hasNextInt();



    }
}

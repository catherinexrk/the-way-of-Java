import java.util.Scanner;

public class 闰年 {
    public static void main(String[] args) {
        int year;
        Scanner my = new Scanner(System.in);
        System.out.println("输入年份");
        year = my.nextInt();

        if(year % 400 == 0 ||(year % 4 ==0 && year % 100 !=0))
            System.out.println(year + " 是闰年");
        else {
            System.out.println(year + " 不是闰年");
        }
    }
}

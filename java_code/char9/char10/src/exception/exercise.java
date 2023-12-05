package exception;

import java.util.Scanner;

/**
 * @author 陶笛
 */
public class exercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0;
        String inputstr = "";


        while(true) {
            System.out.println("输入一个数");
            inputstr = input.next();
            try {
                num = Integer.parseInt(inputstr) ;//这里是可能抛出异常
                break;
            } catch (NumberFormatException e) {
                System.out.println("输入的不是一个整数");
            }
        }

        System.out.println("你输入的数值是: " + num);
    }
}

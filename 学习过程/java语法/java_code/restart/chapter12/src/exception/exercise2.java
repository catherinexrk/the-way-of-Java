package exception;

import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        //要求不断输入一个数直到是整数
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        String inputStr = "";
        while(true){

            System.out.println("输入一个整数:");
            inputStr = scanner.next();
            try {
                num = Integer.parseInt(inputStr); //这里可能抛出异常
                break;//没有抛出异常
            } catch (NumberFormatException e) {
                System.out.println("输入的不是整数");
            }
        }

        System.out.println("num = " + num);
    }
}

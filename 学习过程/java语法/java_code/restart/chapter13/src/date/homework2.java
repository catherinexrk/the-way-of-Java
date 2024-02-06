package date;

import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        String passwd = "";
        String email = "";

        while(true){
            System.out.println("输入注册姓名:");
            name = scanner.next();
            if (name.length() == 2 || name.length() == 3 || name.length() ==4){
                break;
            }
            System.out.println("用户姓名长度不正确，重新输入");
        }

        while (true){
            System.out.println("输入密码，长度是6位且全是数字");
            passwd = scanner.next();
            if (passwd.length()==6 && func(passwd)){
                break;
            }
            System.out.println("输入密码格式不正确，请重新输入");

        }

        while (true){
            System.out.println("输入邮箱");
            email = scanner.next();
            int index1 = email.lastIndexOf("@");
            int index2 = email.lastIndexOf(".");
            if (index1 > 0 & index1 < index2){
                break;
            }
            System.out.println("邮箱格式输入错误");
        }

    }

    public static boolean func(String str){
        char[] chars = str.toCharArray();
        for(char temp : chars){
            if (!(Character.isDigit(temp))){
                return false;
            }
        }
        return true;
    }
}

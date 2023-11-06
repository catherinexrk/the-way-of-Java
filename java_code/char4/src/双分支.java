import java.util.Scanner;

public class 双分支 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int age = myScanner.nextInt();

        if(age > 18 ){
            System.out.println("你已经成年辣");
        } else if(age <18 && age> 12){
            System.out.println("需要对自己的行为负责！");
        } else{
            System.out.println("未成年要多学习");
        }

    }
}

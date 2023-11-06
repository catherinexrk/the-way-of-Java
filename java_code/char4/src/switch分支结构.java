import java.util.Scanner;

public class switch分支结构 {
    public static void main(String[] args) {
        int choice;
        Scanner my = new Scanner(System.in);
        switch (choice = my.nextInt()){
            case 1:
                System.out.println("level 1");
                System.out.println("great");
                break;
            case 2:
                System.out.println("level 2");
                System.out.println("go on");
            case 3:
                int temp;
                System.out.println("input the value of temp");
                temp = my.nextInt();
                System.out.println("temp = "+temp);
                break;
            default:
                System.out.println("over");
        }
    }
}

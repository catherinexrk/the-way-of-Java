import java.util.Scanner;

public class 单分支 {
    public static void main(String[] args) {
        int choice;
        Scanner myScanner = new Scanner(System.in);
        choice = myScanner.nextInt();

        if(choice == 1){
            System.out.println("level 1");
        }
        else{
            System.out.println("level other");
        }
    }
}

import java.util.Scanner;

public class 多分支练习 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        double credit;
        System.out.println("输入信用分");
        credit = myScanner.nextDouble();
        if(credit == 100){
            System.out.println("信用极好");
        } else if (credit > 80 && credit <=99) {
            System.out.println("信用极好");
        } else if (credit > 60 && credit <=89) {
            System.out.println("信用一般");
        } else {
            System.out.println("信用危险!");
        }
    }
}

import java.util.Scanner;

public class 嵌套分支 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        double score;
        char sex;
        score = myScanner.nextDouble();
//        sex = myScanner.nextChar();
        if(score > 80){
            sex = myScanner.next().charAt(0);
            if (sex == '男'){
                System.out.println("您已进入男子决赛组");
            } else if (sex == '女') {
                System.out.println("您已进入女子决赛组");
            }

        } else {
            System.out.println("您已被淘汰");
        }
    }
}

import java.util.Scanner;

public class arrayInit {
    public static void main(String[] args) {
        double[] scores = new double[5];//声明数组
        for (int i = 0;i < scores.length;i++){
            System.out.println("请输入第" + (i+1) +"元素数值");
            Scanner my = new Scanner(System.in);
            scores[i] = my.nextDouble();
        }

        for (int i = 0;i < scores.length;i++){
            System.out.println("第" + (i+1) + "元素的数值= " + scores[i]);
        }

        

    }
}

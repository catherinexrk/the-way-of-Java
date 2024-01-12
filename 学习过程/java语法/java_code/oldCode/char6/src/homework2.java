import java.util.Random;
import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
        MoraGame temp = new MoraGame();
        temp.vsGame();
    }
}

class MoraGame{
    //表示玩家和电脑的出拳
    //0 石头 1 剪刀 2 布
    int player;
    int computer;

    int win_count = 0;

    public int choice(){ //选择生成
        Random temp = new Random();
        int num = temp.nextInt(3);//生成0-2的选择
        return num;
    }

    public void vsGame(){


        int turn_num = 0;//设置回合制
        Scanner in = new Scanner(System.in);
        System.out.println("输入人机比赛回合次数:");
        turn_num = in.nextInt();//输入次数


        for (int i = 1;i <= turn_num;i++){

            computer = choice();//生成电脑选择
            System.out.println("输入玩家的选择（0-2）:");
            player = in.nextInt();

            if (player == 0 && computer == 1){
                System.out.println("player win!");
                win_count++;
            } else if (player == 1 && computer == 2) {
                System.out.println("player win!");
                win_count++;
            } else if (player == 2 && computer == 0)  {
                System.out.println("player win!");
                win_count++;
            } else if (player == computer) {
                System.out.println("平局");
            } else {
                System.out.println("computer win!");
            }
        }

        System.out.println("人机决斗结果如下，玩家获胜次数为: " + win_count);

    }


}
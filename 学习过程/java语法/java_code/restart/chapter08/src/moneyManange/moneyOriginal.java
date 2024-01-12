package moneyManange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.SimpleTimeZone;

/**
 * @author 陶笛
 */
public class moneyOriginal {
    public static void main(String[] args) {
        //1. 显示主菜单
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String key = "";


        //把消费入账和消费保存在数组中
        //2. 也可以使用字符串拼接
        //使用对象
        String details = "----------零钱通明细---------";

        //3. 完成收益入账
//        定义新的变量
        double money = 0;
        double balance = 0;
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");//进行日期格式格式化

        //4.消费部分
        //details进行信息的添加


        //5. 退出部分



        do {

            System.out.println("==========零钱通项目==========");
            System.out.println("\t\t\t 1零钱通明细");
            System.out.println("\t\t\t 2收益入账");
            System.out.println("\t\t\t 3消   费");
            System.out.println("\t\t\t 4退   出");
            System.out.println("请选择（1-4)");

            key = scanner.next();

            //使用switch分支进行分支控制
            String note = "";//消费说明

            switch (key) {
                case "1":
                    System.out.println("零钱通明细");
                    System.out.println(details);

                    break;
                case "2":
                    System.out.println("收益入账");
                    money = scanner.nextDouble();
                    //money范围进行判断范围
                    if (money <= 0){
                        System.out.println("money输入有误");
                        break;
                    }

                    balance += money;//
                    //拼接收益入账到details中
                    date = new Date();//获取当前日期
                    //System.out.println(sdf.format(date));

                    details += "\n收益入账\t" + money + "\t" +sdf.format(date) + "\t" + balance;


                    break;
                case "3":
                    System.out.println("消费金额:");
                    money = scanner.nextDouble();//获取消费金额
                    if (money <= 0){
                        System.out.println("输入的消费金额有误");
                        break;
                    }

                    //进行money范围的校验
                    System.out.println("请输入消费说明");
                    note = scanner.next();
                    balance -= money;//减钱

                    date = new Date();//获取当前日期
                    details += "\n" + note + "\t-" + money + "\t" +  sdf.format(date) + "\t" + balance;


                    break;
                case "4":
                    System.out.println("退出零钱通");
                    loop = false;

                    String choice = "";
                    //循环逻辑，判读用户的输入信息是否符合
                    while (true){
                        System.out.println("你确定要退出? (y/n)");
                        choice = scanner.next();
                        if (choice.equals("y") || choice.equals("n")){
                            break;
                        }
                    }
                    //用户退出输入判断
                    if (choice.equals("y")){
                        loop = false;
                    } else if (choice.equals("n")) {
                        loop = true;
                    }

                    break;
                default:
                    System.out.println("输入有误");
            }


        } while (loop);

        System.out.println("==========退出零钱通==========");
    }
}

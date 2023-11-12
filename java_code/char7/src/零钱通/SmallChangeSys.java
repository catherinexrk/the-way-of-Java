package 零钱通;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class SmallChangeSys {
    //化繁为简
    public static void main(String[] args) {
        //1.给出菜单

        boolean loop = true;//继续选择
        Scanner input = new Scanner(System.in);
        String keys = "";//输入选择

        //3 零钱通收益入账
        double money = 0;
        double banlance = 0;

        String details = "";
        String note = "";

        Date date = null; //日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");//日期格式

        //消费

        do {
            System.out.println("============零钱通菜单============");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退    出");

            System.out.print("请选择(1-4):");
            keys = input.next();

            //使用switch
            switch (keys) {

                case "1":
                    System.out.println("---------零钱通明细---------\n");
                    System.out.println(details);
                    break;

                case "2":
                    System.out.print(" 收益入账金额(金额范围需要>=0):");
                    money = input.nextDouble();
                    //money的数值范围应该校验
                    if (money < 0){
                        System.out.println("金额输入范围有误!请重新输入入账金额");
                        break;//金额输入有问题
                    }

                    banlance += money;//余额增加

                    date = new Date();//获取当前日期
//                    System.out.println(sdf.format(date));
                    //拼接收益入账信息到details中
                    details += "\n 收益入账\t" + money + "\t" + sdf.format(date)+ "\t" + banlance;
                    break;

                case "3":
                    System.out.println("----消费----");
                    System.out.print("输入消费金额:");
                    money = input.nextDouble();
                    if (money <0 || money > banlance){
                        System.out.println("消费金额有误!");
                        break;
                    }
                    //money进行取值检验，在正确范围内
                    System.out.print("消费说明:");
                    note = input.next();//进入使用情况说明
                    banlance -= money;
                    //拼接收益入账信息到details中
                    date = new Date();//获取当前日期
                    details += "\n" + note + "\t-" + money + "\t" + sdf.format(date)+ "\t" + banlance;

                    break;
                case "4":
                    char choice;
                    while(true){
                        System.out.println("你确定要退出吗？(y/n)");
                         choice = input.next().charAt(0);
                        //退出判断循环
                        if (choice == 'y' || choice == 'n'){
                            break;
                        }
                    }

                    if (choice == 'y'){
                        loop = false;
                    }

                    System.out.println("4 退\t\t出");
                    break;
                default:
                    System.out.println("选择有误");
            }


        }while(loop);

        System.out.println("------退出了零钱通------");
    }
}

//2 完成零钱通明细
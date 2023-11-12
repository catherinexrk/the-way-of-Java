package 零钱通.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 该类是完成零钱通各个功能的类
 * 使用oop（面向对象）
 * 将各个功能对应一个方法
 */
public class SmallChangeOOP {

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

    private char choice;

    public void meanMenu(){
        System.out.println("零钱通菜单");
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
                   this.detail();
                    break;

                case "2":
                    this.income();
                    break;

                case "3":
                    this.pay();
                    break;
                case "4":
                    this.end();
                    break;
                default:
                    System.out.println("选择有误");
            }


        }while(loop);
    }

    public void detail(){
        System.out.println(details);
    }

    public void income(){
        System.out.print(" 收益入账金额(金额范围需要>=0):");
        money = input.nextDouble();
        //money的数值范围应该校验
        if (money < 0){
            System.out.println("金额输入范围有误!请重新输入入账金额");
           return;
        }

        banlance += money;//余额增加

        date = new Date();//获取当前日期
//                    System.out.println(sdf.format(date));
        //拼接收益入账信息到details中
        details += "\n 收益入账\t" + money + "\t" + sdf.format(date)+ "\t" + banlance;
    }

    public void pay(){
        System.out.println("----消费----");
        System.out.print("输入消费金额:");
        money = input.nextDouble();
        if (money <0 || money > banlance){
            System.out.println("消费金额有误!");
            return;
        }
        //money进行取值检验，在正确范围内
        System.out.print("消费说明:");
        note = input.next();//进入使用情况说明
        banlance -= money;
        //拼接收益入账信息到details中
        date = new Date();//获取当前日期
        details += "\n" + note + "\t-" + money + "\t" + sdf.format(date)+ "\t" + banlance;
    }

    public void end(){

        while(true){
            System.out.println("你确定要退出吗？(y/n)");

            choice = input.next().charAt(0);
            //退出判断循环
            if (choice == 'y' || choice == 'n'){
                return;
            }
        }

//        if (choice == 'y'){
//            loop = false;
//        }

//        System.out.println("4 退\t\t出");
    }
}

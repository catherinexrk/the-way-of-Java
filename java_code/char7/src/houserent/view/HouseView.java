package houserent.view;

import houserent.HouseRentApp;
import houserent.domain.House;
import houserent.service.HouseService;
import houserent.ultis.Utility;

/**
 * 显示系统操作界面框
 * 2.接受用户输入
 * 3.调用houseservice对于房屋信息进行各种操作
 */
public class HouseView {
    private boolean loop  = true; //控制显示菜单

    private char key = ' ';//接受用户的选择

    private HouseService houseService = new HouseService(10);//设置数组大小韦10，存放10哥房屋出租信息

    public void mainMenu(){
        do {
            System.out.println("房屋出租系统");
            System.out.println("\t\t\t1.新 增 房 源 ");
            System.out.println("\t\t\t2.查 找 房 屋 ");
            System.out.println("\t\t\t3.删 除 房 屋 信 息");
            System.out.println("\t\t\t4.修 改 房 屋 信 息");
            System.out.println("\t\t\t5.房 屋 列 表");
            System.out.println("\t\t\t6.退      出");
            System.out.println("请输入你的选择");
            key = Utility.readChar();

            switch (key) {
                case '1' :
                    System.out.println("新增");
                    addHouse();
                    break;
                case '2' :
                    System.out.println("查找");
                                                                   break;
                case '3' :
                    System.out.println("删除");
                    deleteHouse();
                    break;
                case '4' :
                    System.out.println("修改");
                    break;
                case '5' :
                    System.out.println("房屋列表");
                    listHouse();
                    break;
                case '6' :
                    System.out.println("退出");
                    exit();
                    break;
            };
        }while(loop);
    }

    //显示房屋列表
    public void listHouse(){
        System.out.println("====================房屋列表信息====================");
        System.out.println("信息");
        House[] houses = houseService.list();//得到存储房屋信息的数组

        for (int i = 0 ;i < houses.length ;i++){
            if (houses[i] != null)
                System.out.println(houses[i]);
        }

        System.out.println("==================房屋列表显示完成==================");
    }

    //编写addouse对象，接受输入，并且创建house对象，调用add方法
    public void addHouse(){
        System.out.println("添加房屋信息");
        System.out.println("姓名");
        String name = Utility.readString(8);

        System.out.println("电话");
        String phone = Utility.readString(12);

        System.out.println("地址");
        String address = Utility.readString(10);

        System.out.println("月租金");
        int rent = Utility.readInt(100000);

        System.out.println("状态");
        String state = Utility.readString(3);

        //id是系统自动设置的，自增上增加id
        House houses = new House(0, name, phone, address, rent, state);

        if (houseService.add(houses)){
            System.out.println("添加房屋成功");
        } else{
            System.out.println("添加房屋失败");
        }

    }

    public void deleteHouse(){
        System.out.println("用户删除页面");
        System.out.println("输入要删除的id号(-1退出)");
        int index = Utility.readInt();

        if (index == -1){
            System.out.println("你放弃了删除房屋细腻些");
            return;
        }
        System.out.println("请确认是否删除(y/n)");
        char c = Utility.readChar();
        while(true){
            if (c == 'Y' || c == 'N'){
                if (c == 'Y'){
                    //调用delete删除方法
                    if (houseService.delete(index)){
                        System.out.println("房屋信息删除成功");
                        break;
                    } else {
                        System.out.println("删除房屋编号不存在");
                        break;
                    }
                } else {
                    System.out.println("不删除");
                    break;
                }
            }
        } //对于c的输入选择进行判断
    }

    public void exit(){
        //使用utlity方法
        char c = Utility.readConfirmSelection();
        if (c == 'Y'){
            loop = true;
        }
    }

}

package houseRent.view;

import houseRent.domain.House;
import houseRent.domain.HouseService;
import houseRent.utility.Utility;

/**
 * @author 陶笛
 * 显示页面
 * 接受用户输入
 * 调用HouseService对房屋信息进行操作
 */
public class HouseView {

    private boolean loop = true; //控制显示菜单
    private char key = ' ' ;//接受用户选择
    private HouseService houseService = new HouseService(10);//初始创建10个对象

    //显示主菜单
    //func5() 编写listHouse显示房屋
    public void listHouses(){
        System.out.println("房屋列表信息");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
        House[] houses = houseService.list();//获取房屋信息(数组)  得到所有房屋信息

        for (int i = 0; i < houses.length; i++) {
            if (houses[i] != null){
                System.out.println(houses[i]);
            }
        }

        System.out.println("房屋列表显示完毕");


    }

    //添加房屋信息
    public void addHouse(){
        System.out.println("添加房屋");
        System.out.println("姓名:");
        String name = Utility.readString(8);
        System.out.println("电话:");
        String phone = Utility.readString(12);
        System.out.println("地址:");
        String address = Utility.readString(16);
        System.out.println("月租");
        int rent = Utility.readInt();
        System.out.println("状态:");
        String state = Utility.readString(3);

        //创建一个新的house对象 注意id是系统分配，不能手动分配    新添加的房屋按自增长去实现
        House house = new House(0, name, phone, address, rent, state);

        if (houseService.add(house)){
            System.out.println("房屋信息添加成功");
        } else {
            System.out.println("添加房屋失败");
        }

    }

    //编写delHouse() 接受输入的id，调用service的del方法
    public void delHouse(){
        System.out.println("删除房屋信息");
        System.out.println("请选择要删除的房屋编号(-1表示退出)");
        int id = Utility.readInt();
        if (id == -1){
            System.out.println("你放弃了删除操作选项");
            return;
        }

        char choice = Utility.readConfirmSelection();//该方法本身就有循环判断的逻辑
        if (choice == 'Y'){
            if (houseService.del(id)){
                System.out.println("删除房屋成功");
            } else {
                System.out.println("删除房屋编号不存在");
            }
        } else {
            System.out.println("你已放弃删除操作");
        }




    }

    //退出
    public void exit(){
        char c = Utility.readConfirmSelection();
        if (c == 'Y'){
            loop = false;
        }
    }

    //查找
    public void findHouse(){
        System.out.println("查找房屋信息");
        System.out.println("请输入要查找的id");
        int id = Utility.readInt();

        House houseById = houseService.findById(id);
        if (houseById != null) {
            System.out.println(houseById);
        } else {
            System.out.println("查找的房屋信息不存在");
        }
    }

    //修改
    public void modifyHouse(){
        System.out.println("修改房屋信息");
        System.out.println("请输入要修改的房屋信息id(-1表示退出)");
        //分两块 一个是对应id 一个是对存在的对象进行修改
        int updateId = Utility.readInt();
        if (updateId == -1) {
            System.out.println("放弃房屋信息修改");
            return;
        }

        //根据输入的id进行更新
        House house = houseService.findById(updateId);
        if (house == null){
            System.out.println("要修改的房屋信息不存在，无法修改");
        }

        System.out.println("姓名("+house.getName()+"): " );
        String name = Utility.readString(8,""); //直接回车默认""
        if (!"".equals(name)) { //修改房屋信息
            house.setName(name);
        }

        System.out.println("电话("+house.getPhone()+")");
        String phone = Utility.readString(12)
        if (!"".equals(phone)) {
            house.setPhone(phone);
        }
    }



    public void mainMenu() {

        do {
            System.out.println("房屋出租系统");
            System.out.println("\t\t\t1.新增房源");
            System.out.println("\t\t\t2.查找房源");
            System.out.println("\t\t\t3.删除房源");
            System.out.println("\t\t\t4.修改房源");
            System.out.println("\t\t\t5.房源显示"); //房屋列表
            System.out.println("\t\t\t6.退   出");

            System.out.println("请输入你的选择");

            key = Utility.readChar();
            switch (key){
                case '1':
                    System.out.println("新增");
                    addHouse();
                    break;
                case '2':
                    System.out.println("查找");
                    findHouse();
                    break;
                case '3':
                    System.out.println("删除");
                    delHouse();
                    break;
                case '4':
                    System.out.println("修改");
                    modifyHouse();
                    break;
                case '5':
                    System.out.println("显示");
                    //显示房屋
                    listHouses();
                    break;
                case '6':
                    System.out.println("退出");
                    exit();
                    break;

            }


        }while (loop);
    }
}

package houserent;

import houserent.view.HouseView;

public class HouseRentApp {
    public static void main(String[] args) {
        //整个程序的入口
        new HouseView().mainMenu();
        System.out.println("退出房屋出租系统");
    }
}

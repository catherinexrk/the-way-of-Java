package houserent.service;

import houserent.domain.House;

/**
 * 定义house[]，存放house对象
 *
 */
public class HouseService {
    private House[] houses;//存放house对象的所有信息，用于房屋出租信息的输出以及相关的控制
    private int houseNums = 1;//记录实际houses中存储的信息条数
    private int idCounter = 1;//记录当前id自增上到哪一个数值

    public HouseService(int size){
        houses = new House[size];//指定数组的存档大小
        //测试
        houses[0]= new House(1,"jack","112","testaddress",200,"未出租");
    }

    //返回所有houses信息
    public House[] list(){
        return  houses;
    }

    public boolean add(House newHouse){
        //判断数组是否可以继续相加
        if (houseNums == houses.length){
            System.out.println("数组已满，不能添加");
            return false;
        }
        houses[houseNums++] = newHouse;//把newhouse对象加入到原先houses数组队尾
        //设置一个id自增长机制
        newHouse.setId(++idCounter);//更新newhouse的id
        return true;
    }

    public boolean delete(int deleteId){
        //下标和房屋的编号不是一回事
        int index = -1;
        for (int i = 0 ;i < houseNums;i++){
            if (deleteId == houses[i].getId()) {
                index = i ;//index记录i
            }
        }

        if (index == -1){
            //说明id在数组中不存在
            return false;
        }
        //已经找到了，进行房屋元素信息删除
        for (int i = index; i < houseNums - 1; i++){
            houses[i] = houses[i+1];//数组元素往前统一挪动
        }

        houses[--houseNums] = null;//将当前存在的房屋信息最后一个置为null

        return true;
    }
}

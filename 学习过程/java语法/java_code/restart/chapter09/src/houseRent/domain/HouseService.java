package houseRent.domain;

/**
 * @author 陶笛
 */
public class HouseService {
    //定义house[] 保存house对象
    //响应houseview的调用
    //完成对房屋信息的各种操作crud

    private House[] houses;//保存house对象
    private int houseNum = 1;//记录当前有多少个房屋信息存储
    private int idCounter = 1;//记录当前id自增到哪个数值

    //房屋信息初始化
    public HouseService(int size){
        //new houses
        houses = new House[size];
        //为了配合测试列表信息    初始化一个house对象
        houses[0] = new House(1,"JACK","111","合肥市",2000,"未出组");
    }

    //返回数组
    public House[] list(){
        return houses;
    }

    //add添加信息
    public boolean add(House newHouse){
        //判断是否可以继续添加
        if (houseNum == houses.length) {
            System.out.println("数组已满，不能再添加");
            return false;
        }

        houses[houseNum++] = newHouse;//新的房屋信息追加到数组最后
//        houseNum++;//及时更新房屋数量

        //设计id自增长   更新id
        newHouse.setId(++idCounter);

        return true;
    }

    //del删除房屋信息
    public boolean del(int id){
        int index = -1;
        for (int i = 0; i < houses.length; i++) {
            if (houses[i].getId() == id){
                index = i;
            }
        }

        //判断是否存在该id的房屋信息
        if (index == -1){
            System.out.println("该id未找到");
            return false;
        }

        houses[--index] = null;//把当前存在的房屋信息最后一个设置为null
        houseNum--;
        return true;
    }

    //findById返回house对象
    public House findById(int id){

        //遍历
        for (int i = 0; i < houseNum; i++) {
            if (id == houses[i].getId()){
                return houses[i];
            }
        }

        return null;
    }

    //根据id进行修改房屋信息



}

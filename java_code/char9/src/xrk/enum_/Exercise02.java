package xrk.enum_;

/**
 * @author 陶笛
 * @version 1.0
 */
public class Exercise02 {
    public static void main(String[] args) {
        System.out.println(Season.autumn.toString());
        System.out.println(Season2.SPRING.toString());

    }
}


//演示自定义枚举
class Season{
    private String name;
    private String desc;

    //定义四个对象，并且固定
    public static final Season spring = new Season("春天", "温暖");
    public static final Season summer = new Season("夏天", "炎热");
    public static final Season autumn = new Season("春天", "凉爽");
    public static final Season winter = new Season("春天", "寒冷");


    //1.构造器私有化
    //2.去除set方法，防止属性被修改
    //3.在类部创建一些规定的对象
    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}

//enum Season2{
//    //如果使用enum进行枚举类
//    //1.使用关键词enum替代class
//    //2.Spring("xxx","xxx")
//    //3.多常量，逗号分别
//    //4.定义常量对象写在前面
//
//    SPRING("春天","温暖"),
//    SUMMER("夏天","酷热");
//
//    private String name;
//    private String desc;//描述代码测试冠卷啊速度啊世界ask哈啊大会啊大大
//
//
//    public String getName() {
//        return name;
//    }
//
//    public String getDesc() {
//        return desc;
//    }
//
//    @Override
//    public String toString() {
//        return "Season{" +
//                "name='" + name + '\'' +
//                ", desc='" + desc + '\'' +
//                '}';
//    }
//
//
//}


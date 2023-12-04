package xrk.enum_;

/**
 * @author 陶笛
 */
public class Exercise03 {
    public static void main(String[] args) {
        //使用season2
        Season2 autumn = Season2.Autumn;
        //输出枚举对象的名称
        System.out.println(autumn.name());
        //输出枚举对象的次序 从0开始进行编号
        System.out.println(autumn.ordinal());

        Season2[] values = Season2.values();
        for (Season2 season : values) { //增强for循环
            System.out.println(season.ordinal());
        }

        System.out.println("=======");
        Season2 autumn1 = Season2.valueOf("Autumn");
        System.out.println("autumn1 = " + autumn1);
        System.out.println(autumn == autumn1);

        System.out.println("compare to");
        //将枚举对象的编号进行比较
        System.out.println(Season2.Autumn.compareTo(Season2.Summer));
    }
}

enum Season2{
    Spring("春天","温暖"),
    Summer("夏天","寒冷"),
    Autumn("秋天","凉爽"),
    Winter("冬天","寒冷");

    private String name;
    private String desc;

    private Season2(String name, String desc) {
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
        return "Season2{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}

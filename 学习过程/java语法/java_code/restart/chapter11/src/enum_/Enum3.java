package enum_;

public class Enum3 {
    public static void main(String[] args) {
        Season3 spring = Season3.SPRING;
        Season3 summer = Season3.SUMMER;
        //name方法
        System.out.println(spring.name());
        //oridianl
        System.out.println(spring.ordinal());
        System.out.println(summer.ordinal());
        //values 从反编译看到一个数组
        //该数组含有定义的所有枚举对象

        //增强for循环
        System.out.println(spring.values());
        Season3[] values = Season3.values();
        for (Season3 season : values){
            System.out.println(season);
        }

    }
}

enum Season3{

    SPRING("春天","温暖"),SUMMER("夏天","炎热");
    private String season;
    private String desc;

    private Season3(String season,String desc){
        this.season = season;
        this.desc = desc;
    }


}

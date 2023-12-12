package xrk.enum_;

/**
 * @author 陶笛
 * @version 1.0
 */
public class Exercise01 {
    public static void main(String[] args) {
//        Season spring = new Season("春天", "温暖");
//        Season summer = new Season("夏天", "炎热");
//        Season autumn = new Season("春天", "凉爽");
//        Season winter = new Season("春天", "寒冷");

        //
    }
}


class Season_{
    private String name;
    private String desc;

    public Season_(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
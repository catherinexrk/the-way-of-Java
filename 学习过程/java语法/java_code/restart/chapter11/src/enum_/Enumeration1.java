package enum_;

public class Enumeration1 {
    public static void main(String[] args) {
        Season spring = new Season("春天", "温暖");
        Season summer = new Season("夏天", "寒冷");
        Season autumn = new Season("秋天", "凉爽");
    }
}

class Season{
    private String name;
    private String desc;

    public Season(String name, String desc) {
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

package enum_;

public class Enum2 {
    public static void main(String[] args) {
        System.out.println(Season1.SPRING);
    }
}

class Season1{
    private String name;
    private String desc;

    //1.将构造器私有化
    private Season1(String name,String desc){
        this.name = name;
        this.desc = desc;
    }

    //2.删除set方法，防止属性被修改
    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    //3.在类创建私有对象
    public static Season1 SPRING = new Season1("春天","温暖");
    public static Season1 SUMMER = new Season1("夏天","炎热");

}

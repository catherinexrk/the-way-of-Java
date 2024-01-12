package single;

public class SinggleTon01 {
    public static void main(String[] args) {
//        GirlFriend xh = new GirlFriend("小红");
//        GirlFriend xb = new GirlFriend("小白");
        GirlFriend test = GirlFriend.getInstance();
        System.out.println(test.toString());


    }
}

//girlfriend对象只能唯一
class GirlFriend{

    private String name;
    
    //饿汉式
    //构造器私有化
    //在类的内部创建
    //提供一个公共的静态方法，返回内部对象

    private static GirlFriend gf = new GirlFriend("小红");
    private GirlFriend(String name) {
        this.name = name;
    }

    public static GirlFriend getInstance(){
        return gf;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}
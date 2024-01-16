package single;

/**
 * @author 陶笛
 */

//饿汉式
public class Single {
    public static void main(String[] args) {
//        Grilfriend instance = Grilfriend.getInstance();
//        System.out.println(instance);
        System.out.println(Grilfriend.n1);

    }
}


//有一个类grilfriend
//只能有一个女朋友
class Grilfriend{

    private String name;
    public static int n1 = 10;

    private static Grilfriend gf = new Grilfriend("小红");

    //讲构造器私有化
    //在类的内部直接创建
    //提供一个公共的static方法返回gf对象
    private Grilfriend(String name) {
        System.out.println("构造器被调用");
        this.name = name;
    }

    public static Grilfriend getInstance(){
        return gf;
    }


}

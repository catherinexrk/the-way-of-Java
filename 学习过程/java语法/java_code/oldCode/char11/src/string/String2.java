package string;

/**
 * @author 陶笛
 */
public class String2 {
    public static void main(String[] args) {
        String a = "aaa"; //指向常量池
        String b = new String("aaa");  //指向堆中对象

        System.out.println(a == b);
        System.out.println(a.equals(b));

        System.out.println(a == b.intern()); //b.intern返回常量池的地址
                                             //b指向堆

        System.out.println(b == b.intern());
    }
}

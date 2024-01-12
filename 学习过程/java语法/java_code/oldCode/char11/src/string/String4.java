package string;

/**
 * @author 陶笛
 */
public class String4 {
    public static void main(String[] args) {
        String a = "aaa";
        String b = "bbb";
        //创建一个stringbuilder sb = stringbuilder

        //a b 均指向常量池常量
        //c指向堆，堆中对象指向常量池
        String c = a + b;
    }
}

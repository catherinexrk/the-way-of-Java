package string;

/**
 * @author 陶笛
 */
public class String3 {
    public static void main(String[] args) {
        String s1 = "aaa";
        String s2 = "bbb";
        String s3 = "aaa";
        String s4 = new String("aaa");

        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s1.equals(s4));
    }
}

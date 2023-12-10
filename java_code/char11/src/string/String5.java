package string;

/**
 * @author 陶笛
 */
public class String5 {
    public static void main(String[] args) {
        String a = "aa";
        String b = "bb";
        String c = a + b;

        String D = (a + b).intern();//D指向常量池中的aabb

        System.out.println(D);
        System.out.println();
    }
}

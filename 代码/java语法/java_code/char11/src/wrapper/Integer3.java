package wrapper;

/**
 * @author 陶笛
 */
public class Integer3 {
    public static void main(String[] args) {
        Integer i = new Integer(1);
        Integer j = new Integer(1);

        System.out.println(i == j);//false

        Integer m = 1;
        Integer n = 1;
        //在-128 - 127范围内均直接返回
        System.out.println(m == n);

        Integer x = 128;
        Integer y  =128;
        System.out.println(x == y);

    }
}

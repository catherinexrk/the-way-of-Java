package wrapper;

/**
 * @author 陶笛
 */
public class Interger1 {
    public static void main(String[] args) {
        //手动装箱
        int n1 = 100;
        Integer integer = new Integer(n1);
        Integer integer1 = Integer.valueOf(n1);

        //手动拆箱
        int i = integer.intValue();

        Object boj1 = true?new Integer(1) : new Double(2.0);
        System.out.println(boj1);
    }
}

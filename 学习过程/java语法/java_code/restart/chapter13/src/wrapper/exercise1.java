package wrapper;

public class exercise1 {
    public static void main(String[] args) {
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j);

        Integer m = 1;//Integer.valueOf(1)
        Integer n = 1;
        System.out.println(m == n);

        Integer a = 128;
        Integer b = 128;
        System.out.println(a == b);
    }
}

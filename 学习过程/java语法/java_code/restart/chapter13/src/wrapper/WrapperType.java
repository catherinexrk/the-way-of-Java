package wrapper;

public class WrapperType {
    public static void main(String[] args) {
        //手动装箱
        int n1 = 10;
        Integer integer = new Integer(n1);
        Integer integer1 = Integer.valueOf(n1);

        //自动装箱
        int n2 = 10;
        Integer integer2 = n2;

    }
}

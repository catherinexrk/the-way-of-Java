package wrapper;

public class Interger {
    public static void main(String[] args) {
        int n1 = 100;
        Integer integer = new Integer(n1);//手动装箱
        int temp = Integer.valueOf(integer);//手动拆箱

        int n2 = 100;
        Integer integer1 = n2;//自动装箱+自动拆箱

        int n3 = integer1;

    }
}

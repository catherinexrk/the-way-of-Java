package custom;

/**
 * @author 陶笛
 */
public class customInterface {
    public static void main(String[] args) {

    }
}


interface IA extends Iusb<String,Double> {
    @Override
    default Double get(String s) {
        return null;
    }

    @Override
    default void hi(Double aDouble) {

    }

    @Override
    default void run(Double r1, Double r2, String u1, String u2) {

    }
}

//class IB implements Iusb<> {
//
//    @Override
//    public int get(String s) {
//        return 0;
//    }
//
//    @Override
//    public void hi(int i) {
//
//    }
//
//    @Override
//    public void run(int r1, int r2, String u1, String u2) {
//
//    }
//}

//泛型接口使用
//静态成员不能使用泛型

interface Iusb<U,R>{

    int n = 12;
//    U name = "hello";

    R get(U u);

    void hi(R r);

    void run(R r1,R r2,U u1,U u2);
}


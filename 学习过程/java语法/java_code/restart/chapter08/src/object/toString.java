package object;

/**
 * @author 陶笛
 */
public class toString {
    public static void main(String[] args) {
//        public String toString() {
//            return getClass().getName() + "@" + Integer.toHexString(hashCode());
//        }
        B b = new B();
        System.out.println(b.toString());
        System.out.println(b);

    }
}

class B{
    @Override
    public String toString() {
        return "重写toString方法";
    }
}

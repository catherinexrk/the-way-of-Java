package object;

/**
 * @author 陶笛
 */
public class hash {
    public static void main(String[] args) {
        AA a = new AA();
        AA a1 = new AA();

        System.out.println(a.hashCode());
        System.out.println(a1.hashCode());
    }
}

class AA{}

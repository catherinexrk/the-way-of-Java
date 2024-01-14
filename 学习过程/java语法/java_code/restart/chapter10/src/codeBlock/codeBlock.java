package codeBlock;

/**
 * @author 陶笛
 */
public class codeBlock {
    public static void main(String[] args) {
//        D d = new D();
        System.out.println(D.n1);
    }
}

class D{
    public static int n1 = 10;

    static {
        System.out.println("D static");
    }

    {
        System.out.println("normal codeblock");
    }
}

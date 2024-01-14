package codeBlock;

/**
 * @author 陶笛
 */
public class details {
    public static void main(String[] args) {
//        System.out.println(AA.n1);
        AA a = new AA();
//        System.out.println(a.n1);

        //先执行静态、再普通、最后构造器
    }
}

class AA{
    public static int n1 = 10;

    {
        System.out.println("normal");
    }

    static {
        System.out.println("static");
    }


}

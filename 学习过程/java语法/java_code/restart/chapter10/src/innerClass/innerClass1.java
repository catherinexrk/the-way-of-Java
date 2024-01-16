package innerClass;

/**
 * @author 陶笛
 */

//外部其他类
public class innerClass1 {
    public static void main(String[] args) {

    }
}

class Outer{
    private int n1;

    public Outer(int n1) {
        this.n1 = n1;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }
    {
        System.out.println("我是代码块");
    }

    class inner{

    }
}

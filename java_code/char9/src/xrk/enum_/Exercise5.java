package xrk.enum_;

/**
 * @author 陶笛
 */
public class Exercise5 {
    public static void main(String[] args) {
        B.neverUse.play();
    }
}

interface A{
    public void play();
}

enum B implements A{
    neverUse;


    @Override
    public void play() {
        System.out.println("枚举B继承接口A");
    }
}
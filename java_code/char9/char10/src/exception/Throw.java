package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author 陶笛
 */
public class Throw {
    public static void main(String[] args) {
        f2();
    }

    public void f1() throws FileNotFoundException {
        FileInputStream fis  = new FileInputStream("d/aa.txt");
    }

    public static void f2() throws ArithmeticException{
        int n1 = 10;
        int n2 = 0;
        double res = n1/n2;

    }
}

class Father {
    public void method() throws RuntimeException{

    }
}

class Son extends Father {
    //子类重写父类的方法，对于抛出的方法进行重写
    //抛出的异常类型必须<=父类的异常范围
    @Override
    public void method() throws RuntimeException{
        super.method();
    }
}

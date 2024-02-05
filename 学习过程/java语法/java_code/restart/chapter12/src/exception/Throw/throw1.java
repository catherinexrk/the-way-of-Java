package exception.Throw;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class throw1 {
    public static void main(String[] args) {

    }

    public void f1() throws FileNotFoundException,NullPointerException{
        FileInputStream fis = new FileInputStream("d://aa.txt");
        //本来可以使用try-catch-finally
        //使用throws进行抛出异常
        //
    }
}

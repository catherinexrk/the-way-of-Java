package exception;

/**
 * @author 陶笛
 */
public class ecxeption1 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;

//        int res = num1 / num2;
        //如果程序员认为代码出现异常，可以使用try catch进行异常处理机制
        //保证程序的健壮性
        //进行异常处理，即使出现异常程序也正常进行


        try {
            int res = num1 / num2;
        } catch (Exception e) {
            System.out.println("程序崩溃");
        }

    }
}

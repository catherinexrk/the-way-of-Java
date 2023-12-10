package exception;

/**
 * @author 陶笛
 */
public class TryCatchDetail {
    public static void main(String[] args) {
        try {
            String str = "heklo";
            int a = Integer.parseInt(str);
            System.out.println(" a = " + a);
        } catch (NumberFormatException e) {
            System.out.println("异常信息" + e.getMessage());
        } finally {
            System.out.println("finally 代码块被执行");
        }
    }
}

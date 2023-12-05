package exception;

/**
 * @author 陶笛
 */
public class TryCatchDetail2 {
    public static void main(String[] args) {
        try {
            String name = "hello";
            int a = Integer.parseInt(name);
            System.out.println("a = " + a);}
//        } catch (NumberFormatException e) {
//            throw new RuntimeException(e);
//        }
            finally {
            System.out.println("谁问你了");
        }
    }
}

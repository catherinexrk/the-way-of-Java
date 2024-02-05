package exception;

public class example1 {
    public static void main(String[] args) {
        int n1 = 19;
        int n2 = 0;

        try {
            int result = n1 / n2;
            System.out.println(result);
        } catch (java.lang.Exception e) {
            System.out.println("出现异常辣");
        }
    }
}

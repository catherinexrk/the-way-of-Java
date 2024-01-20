package exception;

public class example {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 0;

        try {
            int res = n1 / n2;
        } catch (Exception e) {
            System.out.println("程序出错");
        }
        System.out.println("程序执行中");
    }
}

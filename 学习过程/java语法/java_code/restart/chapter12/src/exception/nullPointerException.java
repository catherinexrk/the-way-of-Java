package exception;

public class nullPointerException extends Throwable {
    public static void main(String[] args) {
        String name = "";
        System.out.println(name.length());
    }
}

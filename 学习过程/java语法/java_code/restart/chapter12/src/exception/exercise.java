package exception;

public class exercise {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 0;
        try{
            int res = n1/n2;
        }catch (ArithmeticException e){
            System.out.println("message = " +e.getMessage() );
        }catch (java.lang.Exception e){
            System.out.println("finally");
        }

    }
}

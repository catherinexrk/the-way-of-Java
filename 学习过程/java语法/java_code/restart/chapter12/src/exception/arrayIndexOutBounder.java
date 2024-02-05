package exception;

public class arrayIndexOutBounder {
    public static void main(String[] args) {
        try {
            int[] arr = {1,2,3};
            for (int i = 0;i <= arr.length;i++){
                System.out.println(arr[i]);
            }
        } catch (java.lang.Exception e) {
            throw new RuntimeException(e);
        }
    }
}

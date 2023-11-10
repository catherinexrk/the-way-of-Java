public class Method2 {
    public static void main(String[] args) {
        BBB test = new BBB();
        int[] arr = {1,2,3};
        System.out.println(arr[0]);
        test.test(arr);
        System.out.println(arr[0]);
    }
}

class BBB{
    public void test (int[] arr){
        arr[0] = 100;
    }

}

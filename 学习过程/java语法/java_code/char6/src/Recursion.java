public class Recursion {
    public static void main(String[] args) {
        T t = new T();
        t.test(10);
    }
}


class T {
    public  void test(int n) {
        if(n > 2){
            test(n -1);
        }
        else
            System.out.println(" n = " + n);
    }
}
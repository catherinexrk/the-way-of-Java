public class 斐波那契 {
    public static void main(String[] args) {
        斐波那契额 t = new 斐波那契额();
        System.out.println(t.func(2));
        System.out.println(t.func(3));
        System.out.println(t.func(4));
        System.out.println(t.func(5));
    }
}

class 斐波那契额 {
    public int func(int n){
        if (n ==1 || n == 2 )
            return n;
        else
            return func(n -1) + func(n - 2);
    }

}

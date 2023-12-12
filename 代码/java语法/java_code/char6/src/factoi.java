public class factoi {
    public static void main(String[] args) {
        facto t = new facto();
        System.out.println(t.func(2));
    }
}

class facto {
    public int func(int n){
        if (n != 1)
            return n * func(n-1);
        else
            return 1;
    }
}

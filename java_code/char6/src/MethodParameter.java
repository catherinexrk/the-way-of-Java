public class MethodParameter {
    public static void main(String[] args) {
        int a = 12;
        int b = 20;
        System.out.println(" a = " + a + " b = " + b);
        AAA obj = new AAA();
        obj.swap(a,b);
        System.out.println(" a = " + a + " b = " + b);
    }
}

class AAA{
    public void swap(int a,int b){
        System.out.println("a = " + a + "b = " + b);
        int temp = a;
        a = b ;
        b =temp;
        System.out.println("交换后 a = " + a + " b = " + b);
    }
}

public class 重载练习 {
    public static void main(String[] args) {
        OverLoadtest2 test = new OverLoadtest2();
        test.m(2);
        test.m(2,4);
        test.m(2,4,6);
    }
}

class OverLoadtest2{
    public void m(int a){
        System.out.println(Math.pow(a,2));
    }

    public void m(int a,int b){
        System.out.println(Math.pow(a,2) + Math.pow(b,2));
        System.out.println(Math.max(12,23));
    }

    public  void m(int a,int b,int c){
        System.out.println(Math.pow(a,2) + Math.pow(b,2) + Math.pow(c,2));
    }

}

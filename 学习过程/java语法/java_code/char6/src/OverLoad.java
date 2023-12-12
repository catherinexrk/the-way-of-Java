public class OverLoad {
    public static void main(String[] args) {
        //方法的重载
//        System.out.println(100);
//        System.out.println("hello world");
//        System.out.println('a');
//        System.out.println(true);
//        System.out.println(12.23);
    }
    OverLoadTest test = new OverLoadTest();

}

class OverLoadTest{
    public void calculate(int x,int y){
        System.out.println(x + y);
    }

    public void calculate(double x,double y){
        System.out.println(x + y);
    }

    public void calculate(char a,char b){
        System.out.println(a + " " + b);
    }

    public void calculate(String str,char a){
        System.out.println(str + " " + a);
    }
}

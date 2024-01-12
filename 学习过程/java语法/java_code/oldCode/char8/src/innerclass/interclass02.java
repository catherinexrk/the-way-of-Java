package innerclass;

public class interclass02 {
    public static void main(String[] args) {
        Outer08 outer08 = new Outer08();
        outer08.t1();
    }
}

class Outer08{
    private int n1 = 100;
    public String name = "zhangsan";

    class Inner08{
        public void say(){
            System.out.println("n1 = " + n1 + " name = " + name);
        }
    }

    public void t1(){
        Inner08 obj = new Inner08();
        obj.say();
    }
}

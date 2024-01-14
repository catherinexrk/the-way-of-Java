/**
 * @author 陶笛
 */
public class Main{
    public static void main(String[] args) {
        Child child = new Child();
        Child.count++;
        Child child1 = new Child();
        Child.count++;
        Child child2 = new Child();
        Child.count++;


        System.out.println(Child.count);
    }
}

class Child{
    public static int count = 0;
}
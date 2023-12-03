package final_;

public class exercise01 {
    public static void main(String[] args) {
        Circle circle = new Circle(4.0);
        System.out.println("面积 = " + circle.calArea());
    }
}

class Circle{
    private double radius;
    private final double PI;// = 3.14定义的时候直接赋值

    public Circle(double radius){ // 构造器赋值final常量
        this.radius = radius;
        PI = 3.14;
    }

    //代码块给final常量赋值
//    {
//        PI = 3.14;
//    }

    public double calArea(){
        return PI * radius * radius;
    }

}

package final_;

/**
 * @author 陶笛
 */
public class finalExercise {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        System.out.println(circle.getArea());
    }
}

class Circle{
    private double radius;
    private final double PI = 3.14; //定义的时候直接定义final变量

    public Circle(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return PI * radius * radius;
    }
}

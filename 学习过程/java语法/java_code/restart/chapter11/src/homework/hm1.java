package homework;

public class hm1 {
    public static void main(String[] args) {
        Car car = new Car();
        Car car1 = new Car("12");
        System.out.println(car);
        System.out.println(car1);
    }
}

class Car{
    private String price;
    static String color = "white";
    public Car(){
        Car.color = "red";
    }

    public Car(String price){
        this.price = price;
    }

    @Override
    public String toString() {
        return "color = " + color;
    }
}

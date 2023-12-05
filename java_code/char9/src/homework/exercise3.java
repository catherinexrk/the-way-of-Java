package homework;

/**
 * @author 陶笛
 */
public class exercise3 {
    public static void main(String[] args) {
        Car car = new Car(60);
        car.getAir().flow();
    }
}

class Car {
    private double temperature;

    public Car(double temperature) {
        this.temperature = temperature;
    }

    class Air {
        public void flow(){
            if (temperature> 40){
                System.out.println("温度大于40，吹冷气");
            } else if (temperature < 0) {
                System.out.println("吃暖气");
            } else {
                System.out.println("关闭空调");
            }


        }
    }

    public Air getAir(){
        return new Air();
    }
}
package homework;

public class hm6 {
    public static void main(String[] args) {
        Car2 car = new Car2(20);
        car.getAir().flow();
    }
}

class Car2{
    private double tempearture;

    public Car2(double tempearture) {
        this.tempearture = tempearture;
    }

    class Air{
        public void flow(){
            if (Car2.this.tempearture > 40){
                System.out.println("吹冷气");
            } else if (Car2.this.tempearture < 0) {
                System.out.println("吃暖气");
            } else {
                System.out.println("关闭空调 温度正常");
            }
        }
    }
    //
    public Air getAir(){
        return new Air();
    }

}

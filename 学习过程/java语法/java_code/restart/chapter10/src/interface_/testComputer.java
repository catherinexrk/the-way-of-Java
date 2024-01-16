package interface_;

/**
 * @author 陶笛
 */
public class testComputer {
    public static void main(String[] args) {
        Camera camera = new Camera();
        Phone phone = new Phone();
        Computer computer = new Computer();

        computer.work(camera);
        computer.work(phone);

    }
}

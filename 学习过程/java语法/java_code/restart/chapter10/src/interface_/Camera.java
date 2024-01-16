package interface_;

/**
 * @author 陶笛
 */
public class Camera implements UsbInterface{
    @Override
    public void start() {
        System.out.println("Camer启动");
    }

    @Override
    public void stop() {
        System.out.println("Camera停止工作");
    }
}

package interface_;

/**
 * @author 陶笛
 */
public class Phone implements UsbInterface{
    @Override
    public void start() {
        System.out.println("phone启动");
    }

    @Override
    public void stop() {
        System.out.println("phone关闭");
    }

//    @Override
//    public void start() {
//
//    }
//
//    @Override
//    public void stop() {
//
//    }
}

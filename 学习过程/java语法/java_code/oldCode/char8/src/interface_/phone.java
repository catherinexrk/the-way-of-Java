package interface_;

//phone实现usb接口声明的方法
public class phone implements Usb{
    @Override
    public void start() {
        System.out.println("手机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("stop!");
    }
}

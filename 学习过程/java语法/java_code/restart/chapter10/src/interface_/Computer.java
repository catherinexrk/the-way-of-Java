package interface_;

/**
 * @author 陶笛
 */
public class Computer {
    //编写方法 计算机开始工作
    public void work(UsbInterface usbInterface){
        //通过接口来调用方法
        usbInterface.start();
        usbInterface.stop();
    }
}

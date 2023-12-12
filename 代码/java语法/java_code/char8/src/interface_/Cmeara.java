package interface_;

public class Cmeara implements Usb{
    @Override
    public void start() {
        System.out.println("cameara is working");
    }

    @Override
    public void stop() {
        System.out.println("cameara is stopping");
    }
}

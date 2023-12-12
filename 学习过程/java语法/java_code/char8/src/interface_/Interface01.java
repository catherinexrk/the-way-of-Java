package interface_;

public class Interface01 {
    public static void main(String[] args) {
        Cmeara cmeara = new Cmeara();
        phone  ph = new phone();


        Computer computer = new Computer();
        computer.work(ph); //手机接入电脑

        System.out.println("=================");
        computer.work(cmeara);


    }
}

package exercise;

public class exercise01 {
    public static void main(String[] args) throws InterruptedException{
        T2 t2 = new T2();
        t2.start();

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("hi");
            if (i == 5){
                System.out.println("主线程让子线程运行");
                t2.join();
                System.out.println("子线程运行结束，启动主线程");
            }
        }
    }
}

class T2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("hello" + i);
        }
    }
}

package method;

public class threadMethod02 {
    public static void main(String[] args) {
        T2 t2 = new T2();
        t2.start();

        for (int i = 0; i < 10; i++) {
            try {

                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("主线程 吃了 " +i + " 包子 ");

            if (i == 5){
                System.out.println("主线程让子线程先吃包子 ");
                try {
                    t2.join();//子线程插队进行线程运作
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("子线程吃完，主线吃开始吃包子");
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

            System.out.println("子线程 吃了 " + i + " 包子 ");
        }
    }
}

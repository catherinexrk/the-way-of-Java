package threadUse;

public class thread03 {
    public static void main(String[] args) {
        T1 t1 = new T1();
        T1 t2 = new T1();
        Thread thread = new Thread(t1);
        Thread thread1 = new Thread(t2);
        thread.start();
        thread1.start();
        //主线程结束之后立刻退出，但是依然有其余线程未结束，因此其余线程接着运行

    }
}

class T1 implements Runnable{

    int count = 0;

    @Override
    public void run() {
        while (true){
            System.out.println("hello world" + (++count) + Thread.currentThread().getName());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if (count == 10){
                break;
            }
        }
    }
}

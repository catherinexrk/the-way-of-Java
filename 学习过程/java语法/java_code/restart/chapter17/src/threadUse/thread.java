package threadUse;

public class thread {
    public static void main(String[] args) {

        //创建cat
        Cat cat = new Cat();
        cat.start();
        //当main线程启动一个子线程之后Thread-0，主线程不会阻塞

//        System.out.println("主线程继续执行" + Thread.currentThread().getName());

        for (int i = 0; i < 10; i++) {
            System.out.println("主线程" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

class Cat extends Thread{
    int times = 0;
    @Override
    public void run() {
        while (true){
            System.out.println("this is a cat" + (++times) + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if (times == 10){
                break;
            }
        }
    }
}

package threadUse;

/**
 * 通过实现接口runnable
 */

@SuppressWarnings("all")
public class thread02 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        //这里不能调用start
        Thread thread = new Thread(dog);
        thread.start();
    }
}

class ThreaProxy implements Runnable{

    private Runnable target = null;//属性  类型runnable
    @Override
    public void run() {
        if (target != null){
            target.run();
        }
    }

    public ThreaProxy(Runnable runnable){
        this.target = runnable;
    }
}

class Dog implements Runnable{

    int count = 0;
    @Override
    public void run() {
        while (true){
            System.out.println("dog is barring" + (++count) + Thread.currentThread().getName());

            if (count == 10)
                break;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }


}

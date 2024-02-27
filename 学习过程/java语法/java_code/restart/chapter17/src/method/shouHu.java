package method;

public class shouHu {
    public static void main(String[] args) throws InterruptedException{
        //主线程结束、子线程自动结束即可
//        Thread thread = new Thread();
//        thread.setDaemon(); setDaemon进行设置守护进程

        T4 t2 = new T4();
        t2.start();


        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            System.out.println("hi");
        }
        t2.setDaemon(true);
    }
}


class T4 extends Thread{
    @Override
    public void run(){
        while (true){
            System.out.println("hello world");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
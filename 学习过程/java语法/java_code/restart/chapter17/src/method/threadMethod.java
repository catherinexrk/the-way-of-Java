package method;

import java.sql.SQLOutput;

public class threadMethod {
    public static void main(String[] args) {
        Exit exit = new Exit();

        exit.start();
        exit.setPriority(Thread.MAX_PRIORITY);
        System.out.println(exit.getPriority());
        exit.setLoop(false);
    }
}

class Exit extends Thread{
    private int cnt = 100;

    private boolean loop = true;

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    @Override
    public void run() {
        while (loop){


            try {
                System.out.println("线程 " + Thread.currentThread().getName() + (--cnt));
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

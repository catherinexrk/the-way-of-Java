package exit_;

public class exit1 {
    public static void main(String[] args) {
        Exit exit = new Exit();
        exit.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        exit.setLoop(false);
    }

}

class Exit extends Thread{
    private int cnt = 0;

    private boolean loop = true;

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    @Override
    public void run() {
        while (loop){
            System.out.println("线程" + Thread.currentThread().getName() + (++cnt));

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

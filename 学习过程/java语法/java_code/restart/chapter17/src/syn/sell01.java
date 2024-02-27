package syn;

public class sell01 {
    public static void main(String[] args) {
        SellTicket01 sellTicket01 = new SellTicket01();
        SellTicket01 sellTicket02 = new SellTicket01();
        SellTicket01 sellTicket03 = new SellTicket01();
        sellTicket01.start();
        sellTicket02.start();
        sellTicket03.start();


    }
}


//实现接口 使用同步锁实现线程同步
class SellTicket01 extends  Thread{

    private static int ticket_num = 100;

    private boolean loop = true;
    Object object = new Object();

    // public synchronized void sell 是一个同步方法
    //这时候锁在 this对象
    //也可以在代码块上写synchronized
    public /*synchronized void*/ void sell(){ //同步方法 在同一个时刻，只能一个线程来执行run方法
        synchronized (object /*this*/){
            if (ticket_num <= 0){
                System.out.println("售票结束");
                loop = false;
                return;
            }

            //休眠50ms
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(" 窗口 "  + Thread.currentThread().getName() + " 售出一张票 "
                    + " 剩余票数= " + (--ticket_num));
        }
    }

    @Override
    public synchronized void run() {
        while (loop){
            sell();

        }
    }
}

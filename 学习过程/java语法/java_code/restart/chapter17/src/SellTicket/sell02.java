package SellTicket;

@SuppressWarnings("all")
public class sell02 {
    public static void main(String[] args) {
        SellTicket02 sellTicket01 = new SellTicket02();
        SellTicket02 sellTicket02 = new SellTicket02();
        SellTicket02 sellTicket03 = new SellTicket02();
        sellTicket01.start();
        sellTicket02.start();
        sellTicket03.start();
    }
}

class SellTicket02 extends  Thread{

    private static int ticket_num = 100;

    @Override
    public synchronized void run() {
        while (true){
            if (ticket_num <= 0){
                System.out.println("售票结束");
                break;
            }

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

             System.out.println(" 窗口 "  + Thread.currentThread().getName() + " 售出一张票 "
                    + " 剩余票数= " + (--ticket_num));

            //休眠50ms

        }
    }
}


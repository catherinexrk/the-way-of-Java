package SellTicket;



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

class SellTicket01 extends  Thread{

    private static int ticket_num = 100;

    @Override
    public void run() {
        while (true){
            if (ticket_num <= 0){
                System.out.println("售票结束");
                break;
            }

            System.out.println(" 窗口 "  + Thread.currentThread().getName() + " 售出一张票 "
            + " 剩余票数= " + (--ticket_num));

            //休眠50ms
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

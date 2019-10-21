package Singleton.a1;

/**
 * @author ningxy
 * @date 2019/10/21
 */
public class TicketMaker {
    private static TicketMaker ticketMaker = new TicketMaker();
    private int ticket = 1000;

    private TicketMaker() {
    }

//    synchronized关键字确保多线程下工作正常
    public synchronized int getNextTicketNumber() {
        return ticket++;
    }

    public static TicketMaker getInstance() {
        return ticketMaker;
    }
}

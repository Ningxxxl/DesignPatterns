package Singleton.a1;

/**
 * @author ningxy
 * @date 2019/10/21
 */
public class Main {
    public static void main(String[] args) {
        TicketMaker ticketMaker1 = TicketMaker.getInstance();
        TicketMaker ticketMaker2 = TicketMaker.getInstance();

        System.out.println(ticketMaker1.getNextTicketNumber());
        System.out.println(ticketMaker2.getNextTicketNumber());
    }
}

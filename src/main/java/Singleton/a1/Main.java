package Singleton.a1;

/**
 * @author ningxy
 * @date 2019/10/21
 */
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ":" + TicketMaker.getInstance().getNextTicketNumber());
        }
    }
}

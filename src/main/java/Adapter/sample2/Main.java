package Adapter.sample2;

/**
 * @author ningxy
 * @date 2019/10/19
 */
public class Main {
    public static void main(String[] args) {
        AbstractPrint p = new PrintBanner("Hello again!");
        p.printWeek();
        p.printStrong();
    }
}

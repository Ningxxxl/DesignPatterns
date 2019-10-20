package Adapter.sample1;

/**
 * @author ningxy
 * @date 2019/10/19
 */
public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello, It's me.");

        p.printWeek();
        p.printStrong();
    }
}

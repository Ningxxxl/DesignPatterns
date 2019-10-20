package Adapter.sample2;

/**
 * @author ningxy
 * @date 2019/10/19
 */
public class PrintBanner extends AbstractPrint {
    private Banner banner;

    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeek() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}

package Adapter.sample1;

/**
 * 扮演"适配器"角色
 *
 * @author ningxy
 * @date 2019/10/19
 */
public class PrintBanner extends Banner implements Print{
    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeek() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}

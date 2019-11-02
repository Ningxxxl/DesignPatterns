package AbstractFactory.factory;

/**
 * 抽象零件
 * ——表示HTML链接的类
 *
 * @author ningxy
 * @date 2019/10/30
 */
public abstract class AbstractLink extends AbstractItem {
    protected String url;

    public AbstractLink(String caption, String url) {
        super(caption);
        this.url = url;
    }
}

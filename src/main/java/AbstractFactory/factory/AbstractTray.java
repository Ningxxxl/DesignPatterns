package AbstractFactory.factory;

import java.util.ArrayList;

/**
 * 抽象零件
 * ——表示含有Link和Tray的类
 *
 * @author ningxy
 * @date 2019/10/30
 */
public abstract class AbstractTray extends AbstractItem {
    protected ArrayList tray = new ArrayList();

    public AbstractTray(String caption) {
        super(caption);
    }

    public void add(AbstractItem item) {
        tray.add(item);
    }
}

package AbstractFactory.listfactory;

import AbstractFactory.factory.AbstractItem;
import AbstractFactory.factory.AbstractTray;

/**
 * 具体零件
 *
 * @author ningxy
 * @date 2019/10/31
 */
public class ListTray extends AbstractTray {
    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<li>\n");
        buffer.append(caption).append('\n');
        buffer.append("<ul>\n");
        for (Object o : tray) {
            AbstractItem item = (AbstractItem) o;
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("</li>\n");
        return buffer.toString();
    }
}

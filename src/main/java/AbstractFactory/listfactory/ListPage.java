package AbstractFactory.listfactory;

import AbstractFactory.factory.AbstractItem;
import AbstractFactory.factory.AbstractPage;

import java.util.Iterator;

/**
 * 具体零件
 *
 * @author ningxy
 * @date 2019/10/31
 */
public class ListPage extends AbstractPage {
    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html><head><title>").append(title).append("</title></head>\n");
        buffer.append("<body>\n");
        buffer.append("<h1>").append(title).append("</h1>");
        buffer.append("<ul>\n");
        for (Object o : content) {
            AbstractItem item = (AbstractItem) o;
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("<hr><address>").append(author).append("</address>");
        buffer.append("</body></html>");
        return buffer.toString();
    }
}

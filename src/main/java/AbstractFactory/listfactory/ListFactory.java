package AbstractFactory.listfactory;

import AbstractFactory.factory.AbstractFactory;
import AbstractFactory.factory.AbstractLink;
import AbstractFactory.factory.AbstractPage;
import AbstractFactory.factory.AbstractTray;

/**
 * 具体的工厂
 *
 * @author ningxy
 * @date 2019/10/31
 */
public class ListFactory extends AbstractFactory {
    public AbstractLink createLink(String caption, String url) {
        return null;
    }

    public AbstractTray createTray(String caption) {
        return null;
    }

    public AbstractPage createPage(String title, String author) {
        return null;
    }
}

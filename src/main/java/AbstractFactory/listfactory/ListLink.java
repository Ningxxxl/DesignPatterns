package AbstractFactory.listfactory;

import AbstractFactory.factory.AbstractLink;

/**
 * 具体零件
 *
 * @author ningxy
 * @date 2019/10/31
 */
public class ListLink extends AbstractLink {
    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "    <li><a href='" + url + "'>" + caption + "</a></li>\n";
    }
}

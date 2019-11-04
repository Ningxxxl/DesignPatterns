package AbstractFactory;

import AbstractFactory.factory.AbstractFactory;
import AbstractFactory.factory.AbstractLink;
import AbstractFactory.factory.AbstractPage;
import AbstractFactory.factory.AbstractTray;
import AbstractFactory.listfactory.ListFactory;

/**
 * @author ningxy
 * @date 2019/10/31
 */
public class Main {
    public static void main(String[] args) {
        test("AbstractFactory.listfactory.ListFactory");
    }

    private static void test(String clazzName) {
        AbstractFactory factory = AbstractFactory.getFactory(clazzName);

        AbstractLink people = factory.createLink("人民日报", "http://www.people.com.cn");
        AbstractLink gmw = factory.createLink("光明网", "http://ww.gmw.cn");

        AbstractLink usYahoo = factory.createLink("Yahoo!", "http://www.yahoo.com");
        AbstractLink jpYahoo = factory.createLink("Yahoo!Japan", "htpp://www.yahoo.co.jp");

        AbstractLink baidu = factory.createLink("Baidu", "http://www.baidu.com");
        AbstractLink google = factory.createLink("Google", "http://google.com");

        AbstractTray trayNews = factory.createTray("日报");
        trayNews.add(people);
        trayNews.add(gmw);

        AbstractTray trayYahoo = factory.createTray("Yahoo!");
        trayYahoo.add(usYahoo);
        trayYahoo.add(jpYahoo);

        AbstractTray traySearch = factory.createTray("搜索引擎");
        traySearch.add(trayYahoo);
        traySearch.add(baidu);
        traySearch.add(google);

        AbstractPage page = factory.createPage("LinkPage", "nxy");
        page.add(trayNews);
        page.add(traySearch);
        page.output();
    }
}

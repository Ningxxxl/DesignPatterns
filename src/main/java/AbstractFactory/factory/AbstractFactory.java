package AbstractFactory.factory;

/**
 * 抽象工厂
 *
 * @author ningxy
 * @date 2019/10/31
 */
public abstract class AbstractFactory {
    public static AbstractFactory getFactory(String classname) {
        AbstractFactory factory = null;
        try {
            factory = (AbstractFactory) Class.forName(classname).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return factory;
    }

    public abstract AbstractLink createLink(String caption, String url);
    public abstract AbstractTray createTray(String caption);
    public abstract AbstractPage createPage(String title, String author);
}

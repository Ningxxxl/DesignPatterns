package Builder.a2;

/**
 * Builder（建造者）角色
 * <p>
 * 定义了决定文档结构的方法的抽象类
 *
 * @author ningxy
 * @date 2019/10/22
 */
public abstract class AbstractBuilder {
    private boolean initialized = false;

    public void makeTitle(String title) {
        if (!initialized) {
            buildTitle(title);
            initialized = true;
        }
    }

    public void makeString(String string) {
        if (initialized) {
            buildString(string);
        }
    }

    public void makeItems(String[] items) {
        if (initialized) {
            buildItems(items);
        }
    }

    public abstract void buildTitle(String title);

    public abstract void buildString(String string);

    public abstract void buildItems(String[] items);

    public abstract void close();
}

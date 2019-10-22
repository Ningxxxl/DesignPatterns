package Builder.sample;

/**
 * Builder（建造者）角色
 * <p>
 * 定义了决定文档结构的方法的抽象类
 *
 * @author ningxy
 * @date 2019/10/22
 */
public abstract class AbstractBuilder {
    public abstract void makeTitle(String title);

    public abstract void makeString(String string);

    public abstract void makeItems(String[] items);

    public abstract void close();
}

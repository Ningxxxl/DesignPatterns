package TemplateMethod.sample;

/**
 * "抽象类"角色(AbstractClass)
 *
 * @author ningxy
 * @date 2019/10/20
 */
public abstract class AbstractDisplay {
    public abstract void open();
    public abstract void print();
    public abstract void close();

    public final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}

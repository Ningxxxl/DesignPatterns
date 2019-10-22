package Prototype.sample.framework;

/**
 * Prototype（原型）角色
 * <p>
 * 声明了抽象方法use和createClone的接口
 *
 * @author ningxy
 * @date 2019/10/22
 */
public interface Product extends Cloneable {
    void use(String s);

    Product createClone();
}

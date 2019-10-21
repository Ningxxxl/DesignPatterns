package FactoryMethod.sample.framework;

/**
 * Creator（创建者）角色
 *
 * @author ningxy
 * @date 2019/10/21
 */
public abstract class AbstractFactory {
    public final AbstractProduct create(String owner) {
        AbstractProduct product = createProduct(owner);
        registerProduct(product);
        return product;
    }

    protected abstract AbstractProduct createProduct(String owner);

    protected abstract void registerProduct(AbstractProduct product);
}

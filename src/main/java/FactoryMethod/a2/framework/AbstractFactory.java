package FactoryMethod.a2.framework;

/**
 * @author ningxy
 * @date 2019/10/21
 */
public abstract class AbstractFactory {
    public final AbstractProduct create(String owner) {
        AbstractProduct abstractProduct = createProduct(owner);
        registerProduct(abstractProduct);
        return abstractProduct;
    }

    public abstract AbstractProduct createProduct(String owner);

    public abstract void registerProduct(AbstractProduct abstractProduct);
}

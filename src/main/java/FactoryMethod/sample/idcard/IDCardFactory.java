package FactoryMethod.sample.idcard;

import FactoryMethod.sample.framework.AbstractFactory;
import FactoryMethod.sample.framework.AbstractProduct;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * ConcreteCreator（具体的创建者）角色
 *
 * @author ningxy
 * @date 2019/10/21
 */
public class IDCardFactory extends AbstractFactory {
    @Getter
    private List<String> owners = new ArrayList<>();

    @Override
    protected AbstractProduct createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(AbstractProduct product) {
        owners.add(((IDCard)product).getOwner());
    }
}

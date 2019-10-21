package FactoryMethod.sample.idcard;

import FactoryMethod.sample.framework.AbstractProduct;
import lombok.Getter;

/**
 * ConcreteProduct（具体的产品）角色
 *
 * @author ningxy
 * @date 2019/10/21
 */
public class IDCard extends AbstractProduct {
    @Getter
    private String owner;

    IDCard(String owner) {
        this.owner = owner;
        System.out.println("制作【" + owner + "】的IDCard");
    }

    @Override
    public void use() {
        System.out.println("使用【" + owner + "】的IDCard");
    }
}

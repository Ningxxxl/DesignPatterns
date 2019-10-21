package FactoryMethod.a2.idcard;

import FactoryMethod.a2.framework.AbstractProduct;
import lombok.Getter;

/**
 * @author ningxy
 * @date 2019/10/21
 */
public class IDCard extends AbstractProduct {
    @Getter
    private String owner;
    @Getter
    private String idNumber;

    IDCard(String owner, String idNumber) {
        this.owner = owner;
        this.idNumber = idNumber;
        System.out.println("正在创建【" + owner + "】的IDCard：" + idNumber);
    }

    @Override
    public void use() {
        System.out.println("正在使用【" + owner + "】的IDCard：" + idNumber);
    }
}

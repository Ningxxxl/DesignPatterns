package FactoryMethod.a2.idcard;

import FactoryMethod.a2.framework.AbstractFactory;
import FactoryMethod.a2.framework.AbstractProduct;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ningxy
 * @date 2019/10/21
 */
public class IDCardFactory extends AbstractFactory {
    private Map<String, String> cardInfos = new HashMap<>();
    private int serial = 10000;

    @Override
    public AbstractProduct createProduct(String owner) {
        serial++;
        return new IDCard(owner, "No." + serial);
    }

    @Override
    public void registerProduct(AbstractProduct abstractProduct) {
        IDCard idCard = (IDCard)abstractProduct;
        cardInfos.put(idCard.getIdNumber(), idCard.getOwner());
    }
}

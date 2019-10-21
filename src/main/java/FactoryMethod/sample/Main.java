package FactoryMethod.sample;

import FactoryMethod.sample.framework.AbstractFactory;
import FactoryMethod.sample.framework.AbstractProduct;
import FactoryMethod.sample.idcard.IDCardFactory;

/**
 * @author ningxy
 * @date 2019/10/21
 */
public class Main {
    public static void main(String[] args) {
        AbstractFactory idCardFactory = new IDCardFactory();

        AbstractProduct idCard1 = idCardFactory.create("Person 1");
        AbstractProduct idCard2 = idCardFactory.create("Person 2");
        AbstractProduct idCard3 = idCardFactory.create("Person 3");

        idCard1.use();
        idCard2.use();
        idCard3.use();
    }
}

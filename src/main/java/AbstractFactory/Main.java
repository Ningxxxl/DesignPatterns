package AbstractFactory;

import AbstractFactory.factory.AbstractFactory;
import AbstractFactory.listfactory.ListFactory;

/**
 * @author ningxy
 * @date 2019/10/31
 */
public class Main {
    public static void main(String[] args) {
        AbstractFactory factory = AbstractFactory.getFactory("AbstractFactory.listfactory.ListFactory");

    }
}

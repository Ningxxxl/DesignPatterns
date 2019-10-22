package Prototype.sample;

import Prototype.sample.framework.Product;
import lombok.AllArgsConstructor;

import java.io.UnsupportedEncodingException;

/**
 * ConcretePrototype（具体的原型）角色
 *
 * @author ningxy
 * @date 2019/10/22
 */
@AllArgsConstructor
public class UnderlinePen implements Product {
    private char ulChar;

    @Override
    public void use(String s) {
        try {
            int length = s.getBytes("GBK").length;
            System.out.println("\"" + s + "\"");
            System.out.print(" ");
            for (int i = 0; i < length; i++) {
                System.out.print(ulChar);
            }
            System.out.println("");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Product createClone() {
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}

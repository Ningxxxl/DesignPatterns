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
public class MessageBox implements Product {
    private char decoChar;

    @Override
    public void use(String s) {
        try {
            int length = s.getBytes("GBK").length;
            for (int i = 0; i < length + 4; i++) {
                System.out.print(decoChar);
            }
            System.out.println("");
            System.out.println(decoChar + " " + s + " " + decoChar);
            for (int i = 0; i < length + 4; i++) {
                System.out.print(decoChar);
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
            // clone()方法是 浅 拷 贝
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}

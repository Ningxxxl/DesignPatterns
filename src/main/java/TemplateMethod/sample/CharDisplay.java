package TemplateMethod.sample;

import lombok.AllArgsConstructor;

/**
 * "具体类"角色(ConcreteClass)
 *
 * @author ningxy
 * @date 2019/10/20
 */
@AllArgsConstructor
public class CharDisplay extends AbstractDisplay {
    private char ch;

    @Override
    public void open() {
        System.out.println("<<");
    }

    @Override
    public void print() {
        System.out.println(ch);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }
}

package TemplateMethod.sample;

import java.io.UnsupportedEncodingException;

/**
 * "具体类"角色(ConcreteClass)
 *
 * @author ningxy
 * @date 2019/10/20
 */
public class StringDisplay extends AbstractDisplay {
    private String string;
    private int width;

    public StringDisplay(String string) {
        this.string = string;
        try {
//            UTF-8中汉字占3-4个字节，GBK中汉字占2个字节。（外加选用支持中文的等宽字体）
//            this.width = string.getBytes().length;
            this.width = string.getBytes("GBK").length;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void close() {
        printLine();
    }

    private void printLine() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('+');
        for (int i = 0; i < width; i++) {
            stringBuilder.append('-');
        }
        stringBuilder.append('+');
        System.out.println(stringBuilder);
    }
}

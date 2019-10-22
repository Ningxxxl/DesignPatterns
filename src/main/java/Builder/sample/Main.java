package Builder.sample;

/**
 * @author ningxy
 * @date 2019/10/22
 */
public class Main {
    public static void main(String[] args) {
        testTextBuilder();
        testHTMLBuilder();
    }

    private static void testTextBuilder() {
        TextBuilder textBuilder = new TextBuilder();
        Director director = new Director(textBuilder);
        director.construct();
        String result = textBuilder.getResult();
        System.out.println(result);
    }

    private static void testHTMLBuilder() {
        HTMLBuilder htmlBuilder = new HTMLBuilder();
        Director director = new Director(htmlBuilder);
        director.construct();
        String result = htmlBuilder.getResult();
        System.out.println("文件编写完成：" + result);
    }
}

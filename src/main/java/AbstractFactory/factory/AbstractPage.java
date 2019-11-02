package AbstractFactory.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

/**
 * 抽象零件
 * ——表示HTML页面的类
 *
 * @author ningxy
 * @date 2019/10/31
 */
public abstract class AbstractPage {
    protected String title;
    protected String author;
    protected ArrayList content = new ArrayList();

    public AbstractPage(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void add(AbstractItem item) {
        content.add(item);
    }

    public void output() {
        try {
            String filename = title + ".html";
            Writer writer = new FileWriter(filename);
            writer.write(this.makeHTML());
            writer.close();
            System.out.println(filename + " 编写完成.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public abstract String makeHTML();
}

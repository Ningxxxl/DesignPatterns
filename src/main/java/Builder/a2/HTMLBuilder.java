package Builder.a2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * ConcreteBuilder（具体的建造者）角色
 *
 * @author ningxy
 * @date 2019/10/22
 */
public class HTMLBuilder implements Builder {
    private String filename;
    private PrintWriter writer;

    @Override
    public void makeTitle(String title) {
        filename = title + ".html";
        try {
            writer = new PrintWriter(new FileWriter(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.println("<html lang=\"zh-cmn-Hans\">\n");

        writer.println("<head>");
        writer.println("<title>" + title + "</title>");
        writer.println("<meta charset='UTF-8'>");
        writer.println("</head>\n");

        writer.println("<body>");
        writer.println("<H1>" + title + "</H1>");
    }

    @Override
    public void makeString(String string) {
        writer.println("\n<p>" + string + "</p>\n");
    }

    @Override
    public void makeItems(String[] items) {
        writer.println("<ul>");
        for (String item : items) {
            writer.println("<li>" + item + "</li>");
        }
        writer.println("</ul>\n");
    }

    @Override
    public void close() {
        writer.println("</body>\n");
        writer.println("</html>");
        writer.close();
    }

    public String getResult() {
        return filename;
    }
}

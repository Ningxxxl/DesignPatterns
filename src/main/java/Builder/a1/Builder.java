package Builder.a1;

/**
 * @author ningxy
 * @date 2019/10/22
 */
public interface Builder {
    void makeTitle(String title);

    void makeString(String string);

    void makeItems(String[] items);

    void close();
}

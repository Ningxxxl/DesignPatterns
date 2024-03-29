package Builder.a2;

/**
 * ConcreteBuilder（具体的建造者）角色
 *
 * @author ningxy
 * @date 2019/10/22
 */
public class TextBuilder extends AbstractBuilder {
    private StringBuffer buffer = new StringBuffer();

    @Override
    public void buildTitle(String title) {
        buffer.append("======================================\n");
        buffer.append("【 ").append(title).append(" 】\n");
        buffer.append('\n');
    }

    @Override
    public void buildString(String string) {
        buffer.append(" □ ").append(string).append('\n');
        buffer.append('\n');
    }

    @Override
    public void buildItems(String[] items) {
        for (String item : items) {
            buffer.append("  · ").append(item).append('\n');
        }
        buffer.append('\n');
    }

    @Override
    public void close() {
        buffer.append("======================================\n");
    }

    public String getResult() {
        return buffer.toString();
    }
}
